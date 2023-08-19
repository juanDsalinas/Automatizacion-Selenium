package com.addRemove.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/addRemove.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.addRemove.stepsdefinitions"
)

public class addRemoveRunner {

}
