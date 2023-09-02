
package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

import static userinterface.DemoQaElementosCategoriaForms.*;

@AllArgsConstructor
public class VerificarFormsCompleto implements Question<Boolean> {


    private final Map<String, String> mapCaracteristicasEstudiante;

    public static VerificarFormsCompleto enLaPaginaQaDemo(Map<String, String> mapCaracteristicasEstudiante) {
        return new VerificarFormsCompleto(mapCaracteristicasEstudiante);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_VERIFICACION_FIRST_NAME.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("First Name"))
                && LBL_VERIFICACION_EMAIL_FORMS.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("Email"))
                && LBL_VERIFICACION_MOBILE.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("Mobile"))
                && LBL_VERIFICACION_SUBJECTS.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("Subjects"))
                && LBL_VERIFICACION_CURRENT_ADDRESS_FORMS.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("Current Address"))
                && LBL_VERIFICACION_STATE.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("State"))
                && LBL_VERIFICACION_CITY.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("City"))
                && LBL_VERIFICACION_GRACIAS.resolveFor(actor).getText().contains(mapCaracteristicasEstudiante.get("Gracias"));
    }
}