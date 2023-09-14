package com.co.Demoblazo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target BTN_ADD = Target
            .the("button for add product to cart")
            .locatedBy("//div[@class='row']/div/a");
}
