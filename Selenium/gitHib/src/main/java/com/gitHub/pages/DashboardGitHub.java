package com.gitHub.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardGitHub extends PageObject {
    // mapeamos los elementos
    @FindBy(className = "class=\"color-fg-default lh-0 mb-2 markdown-title\"\n")
    WebElement repo;

    @FindBy(className = "js-navigation-open Link--primary")
    WebElement readme;

    @FindBy(xpath = "//*[@id=\"repo-content-turbo-frame\"]/react-app/div/div/div[1]/div/div/main/div[2]/div/div[3]/div[2]/div/div[3]/section/div/article/p")
    WebElement p;

    public void darClickRepo(){
        repo.click();
    }

    public void ingresarAlReadme(){
        readme.click();
    }

    public String devolverValor(){
        return p.getText();
    }
}
