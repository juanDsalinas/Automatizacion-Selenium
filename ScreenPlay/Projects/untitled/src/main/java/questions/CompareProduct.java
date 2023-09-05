package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class CompareProduct implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        //NOS TRAE EL TEXTO por el String
        return Text.of(HomePage.LABEL_PRODUCT).viewedBy(actor).asString();
    }

      public static CompareProduct validation(){
        return new CompareProduct();
    }
}
