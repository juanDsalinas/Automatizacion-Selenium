package com.addRemove.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SecondPage extends PageObject {
    By FATHER_BTN_GENERATE = By.xpath("//div[@class='example']");
    // By BTN_GENERATE = By.tagName("button");
    // seleccionamos al hijo desde el padre
    By BTN_GENERATE = By.xpath("//div[@class='example']//child::button");

    By BTN_DELETE = By.xpath("//div[@id='elements']//descendant::button");

    public By getFATHER_BTN_GENERATE() {
        return FATHER_BTN_GENERATE;
    }

    public void setFATHER_BTN_GENERATE(By FATHER_BTN_GENERATE) {
        this.FATHER_BTN_GENERATE = FATHER_BTN_GENERATE;
    }

    public By getBTN_GENERATE() {
        return BTN_GENERATE;
    }

    public void setBTN_GENERATE(By BTN_GENERATE) {
        this.BTN_GENERATE = BTN_GENERATE;
    }

    public By getBTN_DELETE() {
        return BTN_DELETE;
    }

    public void setBTN_DELETE(By BTN_DELETE) {
        this.BTN_DELETE = BTN_DELETE;
    }
}
