package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_CEDULA = Target.the("Field to cedula")
            .located(By.xpath("//input[@id='reg_username']"));

    public static  final Target TXT_CORREO = Target.the("Field to correo")
            .located(By.xpath("//input[@id='reg_email']"));

    public static final Target TXT_CONTRASENA = Target.the("Field to contrasena")
            .located(By.xpath("//input[@id='reg_password']"));

    public static final Target BTN_ACCEPT = Target.the("Btn to accept")
            .located(By.xpath("//input[@id='privacy_policy_reg']"));

    public static final Target BTN_FINAL = Target.the("Btn Finall")
            .located(By.xpath("//button[@name='register']"));

}