package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import tasks.Login;
import userinterfaces.HomePage;

public class LoginStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Juan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user is in the login page")
    public void theUserIsInTheLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://the-internet.herokuapp.com/dropdown"));
    }

    @When("the user enter the credential")
    public void theUserEnterTheCredential() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());
    }

    @Then("the user should see a dashboard")
    public void theUserShouldSeeADashboard() {
        /*OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareText.validation()
        , Matchers.is("Dashboard")));*/
    }

}
