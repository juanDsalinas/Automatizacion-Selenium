package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    public static final Target SHOPPING_CART = Target
            .the("icon of shopping cart")
            .locatedBy("//div[@class='cart']//div[@class='cart-contents-count']");

    public static final Target  ADDRES_OPTION = Target
            .the("addres option")
            .locatedBy("//div[@class='woocommerce']//ul//li[3]//a");


}
