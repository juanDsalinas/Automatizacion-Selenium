package tasks;

import lombok.extern.java.Log;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.LoginPage;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("1021396262").into(LoginPage.USERNAME),
                Enter.theValue("Salinas20066").into(LoginPage.PASSWORD),
                Scroll.to(LoginPage.USERNAME),
                Click.on(LoginPage.BTN_LOGIN));
    }

    public static Login Enter(){
        return Tasks.instrumented(Login.class);
    }
}
