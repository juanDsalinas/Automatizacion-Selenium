package co.com.google.translate.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // el archivo Features con el lenguaje gerkin
        features = "src/test/resources/features/googletranslate.feature",
        // el mapeo de los step del archivo Features
        glue = "co/com/google/translate/stepdefinitions",
        //
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class GoogleTranslateRunner {

}
