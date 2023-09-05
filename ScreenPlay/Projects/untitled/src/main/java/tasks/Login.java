package tasks;

import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("standard_user").into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue("secret_sauce").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }

    public static Login Enter (){
        return Tasks.instrumented(Login.class);
    }
}