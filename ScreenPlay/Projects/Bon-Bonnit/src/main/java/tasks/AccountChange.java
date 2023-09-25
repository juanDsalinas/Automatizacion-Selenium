package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterfaces.AddressPage;

public class AccountChange implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddressPage.BTN_EDIT));
        actor.attemptsTo(Clear.field(AddressPage.LBL_NAME),
                Enter.theValue("Jose").into(AddressPage.LBL_NAME),
                Clear.field(AddressPage.LBL_LAST_NAME),
                Enter.theValue("Muñoz").into(AddressPage.LBL_LAST_NAME),
                Click.on(AddressPage.R_GENDER),
                Scroll.to(AddressPage.PHONE_NUMBER),
                Clear.field(AddressPage.PHONE_NUMBER),
                Enter.theValue("3103256881").into(AddressPage.PHONE_NUMBER),

                Click.on(AddressPage.COUNTRY),
                Enter.theValue("Colombia").into(AddressPage.COUNTRY),
                Hit.the(Keys.ENTER).into(AddressPage.DEPARTAMENT),

                Click.on(AddressPage.DEPARTAMENT),
                Enter.theValue("Distrito").into(AddressPage.DEPARTAMENT),
                SendKeys.of(Keys.ENTER).into(AddressPage.DEPARTAMENT),

                Scroll.to(AddressPage.CITY),
                Enter.theValue("Bogota").into(AddressPage.CITY),
                SendKeys.of(Keys.ENTER).into(AddressPage.DEPARTAMENT),

                Clear.field(AddressPage.ADDRESS),
                Enter.theValue("calle 100 # 1").into(AddressPage.ADDRESS),
                Click.on(AddressPage.BTN_SAVE));
    }

    public static AccountChange refresh(){
        return Tasks.instrumented(AccountChange.class);
    }
}
