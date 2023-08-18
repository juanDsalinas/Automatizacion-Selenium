package com.BuyAmazon.stepdefinitions;

import com.BuyAmazon.steps.RegisterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BuyAmazonStepDefinition {
    @Steps
    RegisterStep registerStep;

    @Given("Estoy en la pagina principal de Amazon")
    public void estoyEnLaPaginaPrincipalDeAmazon() {
        registerStep.openBrowser();

    }

    @When("Ingreso nombre del producto en la barra de navegacion")
    public void ingresoNombreDelProductoEnLaBarraDeNavegacion() {
        registerStep.enterAndSearch();
    }

    @When("realizo la busqueda")
    public void realizoLaBusqueda() {
        registerStep.sectionProduct();
    }

    @Then("deberia aparecer el primer producto de mi busqueda")
    public void deberiaAparecerElPrimerProductoDeMiBusqueda() {
        registerStep.register();
    }

    @When("Hago clic en el producto y lo agrego al carrito")
    public void hagoClicEnElProductoYLoAgregoAlCarrito() {

    }


    @Then("procedo al proceso de pago")
    public void procedoAlProcesoDePago() {

    }

}
