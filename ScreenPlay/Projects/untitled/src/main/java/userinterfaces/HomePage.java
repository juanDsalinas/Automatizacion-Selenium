package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
public class HomePage {

    public static final Target LABEL_PRODUCT = Target
            .the("text of home page")
            .located(By.xpath("//*[text()='Products']"));

}
