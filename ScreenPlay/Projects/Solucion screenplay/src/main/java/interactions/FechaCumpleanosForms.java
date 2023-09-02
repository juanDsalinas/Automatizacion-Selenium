


package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.DemoQaElementosCategoriaForms.TXT_DATE;

@AllArgsConstructor
public class FechaCumpleanosForms implements Interaction {

    private final Map<String, String> mapCaracteristicasEstudiante;


    public static FechaCumpleanosForms enLaPAginaQaDemo(Map<String, String> mapCaracteristicasEstudiante) {
        return instrumented(FechaCumpleanosForms.class, mapCaracteristicasEstudiante);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Click.on(TXT_DATE));
    actor.attemptsTo(SendKeys.of(Keys.CONTROL + "a").into(TXT_DATE));
    actor.attemptsTo(SendKeys.of(mapCaracteristicasEstudiante.get("Date of Birth")).into(TXT_DATE).thenHit(Keys.ENTER));
    }
}
