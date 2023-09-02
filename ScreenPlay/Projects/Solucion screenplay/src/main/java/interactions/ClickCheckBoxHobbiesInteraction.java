package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static userinterface.DemoQaElementosCategoriaForms.*;

@AllArgsConstructor
public class ClickCheckBoxHobbiesInteraction implements Interaction {

    private final Map<String, String> mapCaracteristicasEstudiante;


    public static ClickCheckBoxHobbiesInteraction enLaPaginaQaDemo(Map<String, String> mapCaracteristicasEstudiante) {
        return Tasks.instrumented(ClickCheckBoxHobbiesInteraction.class, mapCaracteristicasEstudiante);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (mapCaracteristicasEstudiante.get("Hobbies").contains("Sports")) {
            actor.attemptsTo(Scroll.to(CHK_BX_SPORTS));
            actor.attemptsTo(Click.on(CHK_BX_SPORTS));
        }
        if (mapCaracteristicasEstudiante.get("Hobbies").contains("Reading")) {
            actor.attemptsTo(Scroll.to(CHK_BX_READING));
            actor.attemptsTo(Click.on(CHK_BX_READING));
        }
       if (mapCaracteristicasEstudiante.get("Hobbies").contains("Music")) {
            actor.attemptsTo(Scroll.to(CHK_BX_MUSIC));
            actor.attemptsTo(Click.on(CHK_BX_MUSIC));
        }

    }














}
