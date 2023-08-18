package com.BuyAmazon.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// le indicamos que corra el programa con Cucumber
// y que agarre la historia de usuario en lenguaje Gherkin
// para que lo entienda la maquina

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //ruta de los escenarios a transformar
        features = "src/test/resources/features/buyAmazon.feature",
        // esto indica el formato en como queremos que se conviertan los steps de los feautures
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        // indicamos donde ponemos esos escenarios para agregarle pasos
        glue = "com.BuyAmazon.stepdefinitions"

)
public class BuyAmazonRunner {

}
