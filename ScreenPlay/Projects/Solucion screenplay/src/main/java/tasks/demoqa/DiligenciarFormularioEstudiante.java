package tasks.demoqa;

import interactions.ClickCheckBoxHobbiesInteraction;
import interactions.ClickRadioButtonGeneroInteraction;
import interactions.FechaCumpleanosForms;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.DemoQaElementosCategoriaForms.*;

@AllArgsConstructor
public class DiligenciarFormularioEstudiante implements Task {

    private final Map<String, String> mapCaracteristicasEstudiante;

    public static DiligenciarFormularioEstudiante enLaPaginaQaDemo(Map<String, String> mapCaracteristicasEstudiante) {
        return instrumented(DiligenciarFormularioEstudiante.class, mapCaracteristicasEstudiante);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_FORMS));
        actor.attemptsTo(Click.on(BTN_FORMS));
        actor.attemptsTo(Click.on(BTN_PRACTICE_FORMS));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("First Name")).into(TXT_FIRST_NAME));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("Last Name")).into(TXT_LAST_NAME));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("Email")).into(TXT_EMAIL));
        actor.attemptsTo(ClickRadioButtonGeneroInteraction.enLaPaginaQaDemo(mapCaracteristicasEstudiante));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("Mobile")).into(TXT_MOBILE));
        actor.attemptsTo(FechaCumpleanosForms.enLaPAginaQaDemo(mapCaracteristicasEstudiante));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("Subjects")).into(TXT_SUBJECTS).thenHit(Keys.ENTER));
        actor.attemptsTo(ClickCheckBoxHobbiesInteraction.enLaPaginaQaDemo(mapCaracteristicasEstudiante));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("Current Address")).into(TXT_CURRENT_ADDRESS));
        actor.attemptsTo(Click.on(TXT_STAGE_FORMS));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("State")).into(TXT_STAGE_FORMS1).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(TXT_CITY_FORMS));
        actor.attemptsTo(Enter.theValue(mapCaracteristicasEstudiante.get("City")).into(TXT_CITY_FORMS1).thenHit(Keys.ENTER));
        actor.attemptsTo(Click.on(BTN_CREAR_REGISTRO));
    }
}
