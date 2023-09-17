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
import tasks.Cart;
import tasks.Login;

public class CartStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user is in the index page")
    public void theUserIsInTheIndexPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.enter());
    }

    @When("the user clicks on shopping cart")
    public void theUserClicksOnShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cart.clic());
    }

    @Then("the user should see a list of favorite products")
    public void theUserShouldSeeAListOfFavoriteProducts() {

    }
}
