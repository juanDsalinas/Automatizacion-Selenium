package stepsdefinitions;

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
import tasks.Login;
import tasks.LoginFailed;

public class LoginStepDefinitions {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
    }

    @When("the user enter the credentials")
    public void theUserEnterTheCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.Enter());
    }

    @Then("the user should see a dashboard")
    public void theUserShouldSeeADashboard() {
        /**/
    }

    @When("the user enter the failed credentials")
    public void theUserEnterTheFailedCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginFailed.enter());
    }

    @When("the user should see a message error")
    public void theUserShouldSeeAMessageError() {
        /**/
    }





}