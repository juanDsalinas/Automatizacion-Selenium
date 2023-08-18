package com.gitHub.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/login.feature",
    glue = "com/gitHub/stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginGitHubRunner {
}
