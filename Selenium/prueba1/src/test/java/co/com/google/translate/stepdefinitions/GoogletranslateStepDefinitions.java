package co.com.google.translate.stepdefinitions;

import co.com.google.translate.steps.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogletranslateStepDefinitions {

    @Steps
    GoogleHomePage traductor;

    @Given("that Susan wants to translate a word")
    public void thatSusanWantsToTranslateAWord(){
        // traductor.opensGoogleTranslatePage();

    }

    @When("she translates the word {string} from English to Spanish")
    public void sheTranslatesTheWordCheeseFromEnglishToSpanish() {
        // traductor.enterTheWordToTranslate();
    }

    @Then("she should see the word queso in the screen")
    public void sheShouldSeeTheWordInTheScreen(){

    }

}
