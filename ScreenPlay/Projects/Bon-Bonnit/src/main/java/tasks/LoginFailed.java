package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.LoginPage;

public class LoginFailed implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("12121212").into(LoginPage.USERNAME),
                Enter.theValue("123456").into(LoginPage.PASSWORD),
                Scroll.to(LoginPage.USERNAME),
                Click.on(LoginPage.BTN_LOGIN));
    }

    public static LoginFailed enter(){
        return Tasks.instrumented(LoginFailed.class);
    }
}
