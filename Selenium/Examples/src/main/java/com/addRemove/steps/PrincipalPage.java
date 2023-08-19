package com.addRemove.steps;

import com.addRemove.pageObjects.IndexPage;
import com.addRemove.pageObjects.SecondPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class PrincipalPage {
    IndexPage indexPage = new IndexPage();
    SecondPage secondPage = new SecondPage();
    Actions actions = new Actions(indexPage.getDriver());

    @Step
    public void open(){
        indexPage.open();
    }

    @Step
    public void seleccionar(){
        indexPage.getDriver().findElement(indexPage.getENLACE()).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step
    public void generate(){
        secondPage.getDriver().findElement(secondPage.getBTN_GENERATE()).click();
    }

    @Step
    public void delete(){
        secondPage.getDriver().findElement(secondPage.getBTN_DELETE()).click();
        actions.contextClick().perform();
    }

}
