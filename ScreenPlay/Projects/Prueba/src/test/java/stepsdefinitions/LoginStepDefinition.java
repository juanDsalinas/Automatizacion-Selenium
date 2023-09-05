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
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import tasks.DiligenciarForm;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import java.util.Map;

public class LoginStepDefinition {

    // indicamos el driver a utilizar
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Juan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("he user enter to web page")
    public void heUserEnterToWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/mi-cuenta/"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("he user enter the credentials")
    public void heUserEnterTheCredentials(Map<String, String> mapCaracteristicasEstudiante) {
        // OnStage.theActorInTheSpotlight().attemptsTo(Login.Enter());
        OnStage.theActorInTheSpotlight().should(DiligenciarForm.enLaPaginaQ(mapCaracteristicasEstudiante));
    }

    @Then("he user his log sucessfull")
    public void heUserHisLogSucessfull() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.validation()
        //, Matchers.is("Mauricio")));
    }

}
