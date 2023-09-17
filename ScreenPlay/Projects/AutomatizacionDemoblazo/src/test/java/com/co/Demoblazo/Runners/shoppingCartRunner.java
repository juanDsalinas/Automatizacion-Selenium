package com.co.Demoblazo.Runners;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/shopping_cart.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.Demoblazo.StepsDefinitions"
)

public class shoppingCartRunner {

}
