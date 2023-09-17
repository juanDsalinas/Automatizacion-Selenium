package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target LBL_USERNAME = Target
            .the("the username field")
            .locatedBy("//input[@id='login_field']");

    public static final Target LBL_PASSWORD = Target
            .the("the password field")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_LOGIN = Target
            .the("the btn login")
            .locatedBy("//input[@value='Sign in']");


}
