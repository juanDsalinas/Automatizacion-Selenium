package com.co.Demoblazo.tasks;

import com.co.Demoblazo.models.Credentials;
import com.co.Demoblazo.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Login implements Task {

    Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getName()).into(LoginPage.LABEL_NAME));
        actor.attemptsTo(Enter.theValue(credentials.getAddres()).into(LoginPage.ADRESS));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.ACCEPT_TERMS));
        actor.attemptsTo(Click.on(LoginPage.BTN_REGISTER));
    }

    public static Login Enter(Credentials credentials){
        return Tasks.instrumented(Login.class,credentials);
    }
}
