package com.gitHub.stepdefinitions;

import com.gitHub.steps.GitHubLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.concurrent.TimeUnit;

public class LoginGitHubStepDefinitions {
    @Steps
    GitHubLogin login;

    @Given("Que estoy en la página de inicio de sesión de Github")
    public void queEstoyEnLaPaginaDeInicioDeSesionDeGithub() {
        login.openGitHub();
    }

    @When("Ingreso mi dirección de correo electrónico {string} y mi contraseña {string}")
    public void ingresoMiDireccionDeCorreoElectronicoYMiContrasena(String arg0, String arg1) {
        login.ingresarDatosFormulario(arg0,arg1);
    }

    @And("Presiono el botón de inicio de sesión")
    public void presionoElBotonDeInicioDeSesion() {
        login.doyClick();

    }

    @Then("Debería ser redirigido al dashboard de mi cuenta el cual es {string}")
    public void deberiaSerRedirigidoAlDashboardDeMiCuenta(String accountUrl) {
        login.probarUrl(accountUrl);
    }

    ////////////////////////////////////////////////////////////////////////////////////

    @Given("Que me encuentro en el dashboard de mi github")
    public void queMeEncuentroEnElDashboardDeMiGithub() {
        login.clickInicial();
    }

    @When("Hago click en el repositorio de JavaOwn")
    public void hagoClickEnElRepositorioDeJavaOwn() {
        login.leerReadme();
    }

    @Then("vDebería ser redirigido a la url del repositorio {string}")
    public void vdeberiaSerRedirigidoALaUrlDelRepositorio(String arg0) {
        login.devolver();
    }

    @And("Debería ver la descripción del readme como {string}")
    public void deberiaVerLaDescripcionDelReadmeComo(String arg0) {

    }

}
