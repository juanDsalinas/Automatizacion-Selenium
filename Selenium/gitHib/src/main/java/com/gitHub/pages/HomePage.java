package com.gitHub.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://github.com/login")
public class HomePage extends PageObject {
    // mapeamos los elementos
    @FindBy(id = "login_field")
    WebElement txtInput;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login\"]/div[4]/form/div/input[13]")
    WebElement btn;

    @Step
    public void ingresarDatos(String user,String pass){
        txtInput.sendKeys(user);
        password.sendKeys(pass);
    }

    public void darClick(){
        btn.click();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String validacionUrl() {
        return getDriver().getCurrentUrl();
    }
}
