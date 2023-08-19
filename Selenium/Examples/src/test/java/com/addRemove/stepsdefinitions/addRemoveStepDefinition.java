package com.addRemove.stepsdefinitions;

import com.addRemove.steps.PrincipalPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class addRemoveStepDefinition {
    @Steps
    PrincipalPage principalPage;


    @Given("Ingresar a la pagina")
    public void ingresarALaPagina() {
        principalPage.open();
    }

    @When("doy click en el segundo enlace")
    public void doyClickEnElSegundoEnlace() {
        principalPage.seleccionar();
    }

    @And("doy click en agregar elemento")
    public void doyClickEnAgregarElemento() {
        principalPage.generate();
        principalPage.generate();
    }

    @Then("Aparecer un nuevo elemento")
    public void aparecerUnNuevoElemento() {
        principalPage.delete();
    }

}
