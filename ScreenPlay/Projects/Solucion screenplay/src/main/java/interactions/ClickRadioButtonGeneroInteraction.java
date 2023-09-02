package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.DemoQaElementosCategoriaForms.*;

@AllArgsConstructor
public class ClickRadioButtonGeneroInteraction implements Interaction {

    private final Map<String, String> mapCaracteristicasEstudiante;


    public static ClickRadioButtonGeneroInteraction enLaPaginaQaDemo(Map<String, String> mapCaracteristicasEstudiante) {
        return instrumented(ClickRadioButtonGeneroInteraction.class, mapCaracteristicasEstudiante);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (mapCaracteristicasEstudiante.get("Gender").contains("Male")) {
            actor.attemptsTo(Click.on(BTN_MALE));
        }
        if (mapCaracteristicasEstudiante.get("Gender").contains("Female")) {
            actor.attemptsTo(Click.on(BTN_FEMALE));
       }
        if (mapCaracteristicasEstudiante.get("Gender").contains("Other")) {
            actor.attemptsTo(Click.on(BTN_OTHER));
        }

    }
}
