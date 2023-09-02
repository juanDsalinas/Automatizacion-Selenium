package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.VerificarFormsCompleto;
import tasks.demoqa.DiligenciarFormularioEstudiante;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomatizacionPaginaDemoQaStepDefinition {


    @Dado("que {string} se encuentra en la pagina web {string}")
    public void abrirPaginaWeb(String nombreActor, String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nombreActor).wasAbleTo(Open.url(url));
    }

    @When("seleccione la opcion de Forms con la categoria Practice Form con el registro de los datos")
    public void diligenciarFormularioEstudiante(Map<String, String> mapCaracteristicasEstudiante) {
        theActorInTheSpotlight().attemptsTo(DiligenciarFormularioEstudiante.enLaPaginaQaDemo(mapCaracteristicasEstudiante));
    }
    @Then("Puedo ver el mensaje de agradecimiento y mis datos en pantalla")
        public void verificarFormsEnPantalla(Map<String, String> mapCaracteristicasEstudiante) {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarFormsCompleto.enLaPaginaQaDemo(mapCaracteristicasEstudiante),
                    Matchers.equalTo(Boolean.TRUE)));

        }
    }
