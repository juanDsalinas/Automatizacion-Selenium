package com.co.Demoblazo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target LABEL_NAME = Target
            .the("name")
            .locatedBy("//*[@id=\"reg_username\"]");

    public static final Target ADRESS = Target
            .the("addres of correo")
            .locatedBy("//input[@id='reg_email']");

    public static final Target PASSWORD = Target
            .the("password")
            .locatedBy("//input[@id='reg_password']");

    public static final Target ACCEPT_TERMS = Target
            .the("accept terms and conditions")
            .locatedBy("//*[@id=\"newsletter_authorization\"]");

    public static final Target BTN_REGISTER = Target
            .the("btn to register")
            .locatedBy("//button[@value='Registrarse']");
}
