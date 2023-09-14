package com.co.Demoblazo.StepsDefinitions;

import com.co.Demoblazo.tasks.ShopppingCart;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ShoppingCartStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public  void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Juan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given(": the user is on the index page")
    public void theUserIsOnTheIndexPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/#"));
    }

    @When(": the user clicks on {string} option")
    public void theUserClicksOnOption(String string) {
        OnStage.theActorInTheSpotlight().attemptsTo(ShopppingCart.add());
    }

    @And(": the user clicks on the first product result")
    public void theUserClicksOnTheFirstProductResult() {

    }

    @And(": the user add the product to the shopping cart")
    public void theUserAddTheProductToTheShoppingCart() {

    }

    @Then("the user should be presented with a modal view confirming the action")
    public void theUserShouldBePresentedWithAModalViewConfirmingTheAction() {

    }

}
