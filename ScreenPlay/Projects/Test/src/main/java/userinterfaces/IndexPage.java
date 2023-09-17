package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    public static final Target SHOPPING_CART = Target
            .the("icon of shopping cart")
            .locatedBy("//div[@class='cart']//a[@class='cart-contents']");
}
