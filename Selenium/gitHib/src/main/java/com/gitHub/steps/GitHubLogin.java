package com.gitHub.steps;

import com.gitHub.pages.DashboardGitHub;
import com.gitHub.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class GitHubLogin {
    HomePage homePage;
    DashboardGitHub dash;

    @Step
    public void openGitHub(){
        homePage.open();
    }

    public void ingresarDatosFormulario(String usuario, String clave){
        homePage.ingresarDatos(usuario,clave);
    }

    @Step
    public void doyClick(){
        homePage.darClick();
    }

    @Step
    public void probarUrl(String resultUrl){
        Assert.assertEquals(homePage.validacionUrl(),resultUrl);
    }

    /////////////////////////////////////////////////////////////////////////////////
    @Step
    public void clickInicial(){
        dash.darClickRepo();
    }

    @Step
    public void leerReadme(){
        dash.ingresarAlReadme();
    }

    @Step
    public void devolver(){
        System.out.println(dash.devolverValor());
    }

}
