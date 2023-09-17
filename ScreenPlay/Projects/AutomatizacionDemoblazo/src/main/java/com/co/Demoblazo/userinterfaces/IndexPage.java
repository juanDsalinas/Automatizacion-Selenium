package com.co.Demoblazo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    public static  final Target MENU_OPTION = Target
            .the("Menu option 'Monitors' ")
            .locatedBy("//div[@class='list-group']/a[4]");

    public static final Target RESULT_PRODUCT = Target
            .the("first result product for the option 'Monitors' ")
            .locatedBy("//div[@class='row']//div[contains(@class,'card')]/a");
    
}
