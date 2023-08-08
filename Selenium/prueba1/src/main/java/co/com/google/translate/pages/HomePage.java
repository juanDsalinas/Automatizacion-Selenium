package co.com.google.translate.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/v1/")
//@DefaultUrl("https://www.deepl.com/es/translator")

public class HomePage extends PageObject {
    @FindBy(id = "login-button")
    WebElement btn;

    @FindBy(id = "user-name")
    WebElement usuario;

    @FindBy(id = "password")
    WebElement password;

    public void enterTheWordToTranslate(String user,String pass){
        usuario.sendKeys(user);
        password.sendKeys(pass);
    }

    public void clickOnEnglishSourceButton(){
        btn.click();
    }

    //public String resultWordToTranslate(){
    //    return textResultLanguage.getText();
    //}
}
