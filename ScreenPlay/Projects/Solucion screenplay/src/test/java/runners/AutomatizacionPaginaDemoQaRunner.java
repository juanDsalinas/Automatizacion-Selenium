package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automatizacion_pagina_demo_qa.feature",
        glue = "stepdefinitions"
)
public class AutomatizacionPaginaDemoQaRunner {}