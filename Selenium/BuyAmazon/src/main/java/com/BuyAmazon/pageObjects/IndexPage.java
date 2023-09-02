package com.BuyAmazon.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("")
// https://www.amazon.com/-/es/ref=nav_logo
public class IndexPage extends PageObject {
    By BAR_SEARCH = By.xpath("//input[@id='twotabsearchtextbox']");
    By BTN_SEARCH = By.xpath("//input[@id='nav-search-submit-button']");
    By RESULT_PRODUCT = By.xpath("//html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]");

    By ADD_LIST = By.xpath("//*[@id=\"wishListMainButton\"]/span/a");

    // Inicio de sesion
    By USER = By.xpath("//*[@id=\"ap_email\"]");

    By BTN_CONTINUE = By.xpath("//*[@id=\"continue\"]");

    By PASSWORD = By.xpath("//*[@id=\"ap_password\"]");
    By BTN_INICIO = By.xpath("//*[@id=\"signInSubmit\"]");

    By BTN_WISH = By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]");
    public By getBAR_SEARCH() {
        return BAR_SEARCH;
    }

    public void setBAR_SEARCH(By BAR_SEARCH) {
        this.BAR_SEARCH = BAR_SEARCH;
    }

    public By getBTN_SEARCH() {
        return BTN_SEARCH;
    }

    public void setBTN_SEARCH(By BTN_SEARCH) {
        this.BTN_SEARCH = BTN_SEARCH;
    }

    public By getRESULT_PRODUCT() {
        return RESULT_PRODUCT;
    }

    public void setRESULT_PRODUCT(By RESULT_PRODUCT) {
        this.RESULT_PRODUCT = RESULT_PRODUCT;
    }

    public By getADD_LIST() {
        return ADD_LIST;
    }

    public void setADD_LIST(By ADD_LIST) {
        this.ADD_LIST = ADD_LIST;
    }

    public By getUSER() {
        return USER;
    }

    public void setUSER(By USER) {
        this.USER = USER;
    }

    public By getBTN_CONTINUE() {
        return BTN_CONTINUE;
    }

    public void setBTN_CONTINUE(By BTN_CONTINUE) {
        this.BTN_CONTINUE = BTN_CONTINUE;
    }

    public By getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(By PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public By getBTN_INICIO() {
        return BTN_INICIO;
    }

    public void setBTN_INICIO(By BTN_INICIO) {
        this.BTN_INICIO = BTN_INICIO;
    }

    public By getBTN_WISH() {
        return BTN_WISH;
    }

    public void setBTN_WISH(By BTN_WISH) {
        this.BTN_WISH = BTN_WISH;
    }
}
