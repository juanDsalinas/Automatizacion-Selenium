package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Account;
import tasks.AccountChange;

public class AccountStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }

    @When("the user clicks on the addres option")
    public void theUserClicksOnTheAddresOption() {
        OnStage.theActorInTheSpotlight().attemptsTo(Account.change());
    }

    @When("the user change their addres and save the changes")
    public void theUserChangeTheirAddresAndSaveTheChanges() {
        OnStage.theActorInTheSpotlight().attemptsTo(AccountChange.refresh());
    }

    @Then("the user should see their addres")
    public void theUserShouldSeeTheirAddres() {

    }

}
