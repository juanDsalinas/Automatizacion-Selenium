package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("ingresa usuario")
            .located(By.xpath("//input[@class='form_input']"));

    public static final Target TXT_PASSWORD = Target.the("ingresa contraseña")
            .located(By.xpath("//input[@id='password']"));

    public static final Target BTN_LOGIN = Target.the("btn Login")
            .located(By.xpath("//input[@class='btn_action']"));
}
