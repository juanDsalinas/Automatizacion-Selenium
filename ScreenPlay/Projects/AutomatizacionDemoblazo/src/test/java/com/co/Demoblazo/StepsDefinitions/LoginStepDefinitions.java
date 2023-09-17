package com.co.Demoblazo.StepsDefinitions;

import com.co.Demoblazo.models.Credentials;
import com.co.Demoblazo.tasks.Login;
import com.co.Demoblazo.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Juan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user enter in the web page")
    public void theUserEnterInTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("the user enter the credentials")
    public void theUserEnterTheCredentials(List<Credentials> credentialsList) {
        Credentials credentials;

        credentials = credentialsList.get(1);

        OnStage.theActorInTheSpotlight().attemptsTo(Login.Enter(credentials));
    }

    @Then("the user should see the index page")
    public void theUserShouldSeeTheIndexPage() {

    }
}
