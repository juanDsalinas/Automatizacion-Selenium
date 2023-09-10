package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;
import static userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.Map;

public class DiligenciarForm implements Task {

    private final Map<String, String> mapCaracteristicasEstudiante;

    public static DiligenciarForm enLaPaginaQ (Map<String, String>mapCaracteristicasEstudiante){
        return instrumented(DiligenciarForm.class, mapCaracteristicasEstudiante);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.TXT_CEDULA));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("cedula")).into(LoginPage.TXT_CEDULA));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("correo")).into(LoginPage.TXT_CORREO));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("contrasena")).into(LoginPage.TXT_CONTRASENA));
        actor.attemptsTo(Click.on(LoginPage.BTN_ACCEPT));
        actor.attemptsTo(Click.on(LoginPage.BTN_FINAL));
    }
    
}