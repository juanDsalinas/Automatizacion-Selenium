package com.addRemove.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://the-internet.herokuapp.com/")
public class IndexPage extends PageObject {

    By ENLACE = By.xpath("//a[@href=\'/add_remove_elements/\']");

    public By getENLACE() {
        return ENLACE;
    }

    public void setENLACE(By ENLACE) {
        this.ENLACE = ENLACE;
    }
}
