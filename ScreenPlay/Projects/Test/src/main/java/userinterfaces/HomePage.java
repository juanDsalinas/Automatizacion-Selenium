package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TXT_INITIAL = Target
            .the("the text initial")
            .locatedBy("//div//span[contains(text(),'Dashboard')]");


    public static final Target TXT_AREA = Target
            .the("the text for click")
            .locatedBy("//div[@id='hot-spot']");


    public static final Target CHECK_BOX = Target
            .the("checkbox one")
            .locatedBy("//form[@id='checkboxes']//input");


    public static final Target DROPDOWN = Target
            .the("dropdown to choose a option")
            .locatedBy("//select[@id='dropdown']");
}
