package com.BuyAmazon.steps;

import com.BuyAmazon.pageObjects.IndexPage;
import net.thucydides.core.annotations.Step;

public class RegisterStep {
    // instanciamos la pagina la cual mapeamos para poder crear los metodos para poder
    // realizar la automatizacion
    IndexPage indexPage = new IndexPage();

    @Step
    public void openBrowser(){
        indexPage.open();
    }

    @Step
    public void enterAndSearch(){
        indexPage.getDriver().findElement(indexPage.getBAR_SEARCH()).sendKeys("Queso");
        indexPage.getDriver().findElement(indexPage.getBTN_SEARCH()).submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step public void sectionProduct(){
        indexPage.getDriver().findElement(indexPage.getRESULT_PRODUCT()).click();
        indexPage.getDriver().findElement(indexPage.getADD_LIST()).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step
    public void  register(){
        indexPage.getDriver().findElement(indexPage.getUSER()).sendKeys("juandsalinas2018@gmail.com");
        indexPage.getDriver().findElement(indexPage.getBTN_CONTINUE()).click();
        indexPage.getDriver().findElement(indexPage.getPASSWORD()).sendKeys("emoji2018");
        indexPage.getDriver().findElement(indexPage.getBTN_INICIO()).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        indexPage.getDriver().findElement(indexPage.getBTN_WISH()).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
