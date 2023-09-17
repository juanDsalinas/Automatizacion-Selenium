package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.HomePage;

public class CompareText implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.TXT_INITIAL).viewedBy(actor).asString();
    }

    public static  CompareText validation(){
        return new CompareText();
    }


}