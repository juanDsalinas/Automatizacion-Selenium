package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import userinterfaces.HomePage;
import userinterfaces.LoginPage;

import javax.naming.Context;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*Click derecho*/
        /*actor.attemptsTo(RightClick.on(HomePage.TXT_AREA));*/

        /*Checkbox*/
        /*actor.attemptsTo(Select);*/
        /*actor.attemptsTo(Click.on(HomePage.CHECK_BOX));*/

        /*DropDown*/
        /*actor.attemptsTo(Click.on(HomePage.DROPDOWN));*/
        /*actor.attemptsTo(SelectFromOptions.byVisibleText("Option 1").from(HomePage.DROPDOWN));*/

        /*actor.attemptsTo(SelectFromOptions.byValue("2").from(HomePage.DROPDOWN));*/
        actor.attemptsTo(SelectFromOptions.byIndex(2).from(HomePage.DROPDOWN));

        /*actor.attemptsTo(Enter.theValue("juandsalinasnacun@gmail.com").into(LoginPage.LBL_USERNAME),
        Enter.theValue("Em@ji2018").into(LoginPage.LBL_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));*/


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Login enter(){
        return Tasks.instrumented(Login.class);
    }
}
