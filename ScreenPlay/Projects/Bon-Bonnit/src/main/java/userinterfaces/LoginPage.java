package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME = Target
            .the("the input username")
            .locatedBy("//input[@id='username']");

    public static final  Target PASSWORD = Target
            .the("the input password")
            .locatedBy("//input[@id='password']");

    public static final  Target BTN_LOGIN = Target
            .the("the btn login")
            .locatedBy("//div[@id='customer_login']//button");
}