package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class AddressPage {
    public static final Target BTN_EDIT = Target
            .the("the tbn to edit their address")
            .locatedBy("//div[@class='woocommerce-MyAccount-content']//div[2]//div[2]//a");

    public static final Target LBL_NAME = Target
            .the("the field of name")
            .locatedBy("//input[@id='shipping_first_name']");

    public static final Target LBL_LAST_NAME = Target
            .the("the field of last name")
            .locatedBy("//input[@id='shipping_last_name']");

    public static final Target R_GENDER = Target
            .the("the field of last name")
            .locatedBy("//input[@id='shipping_gender_option_2']");

    public static final Target PHONE_NUMBER = Target
            .the("the field of phone number")
            .locatedBy("//input[@id='shipping_phone']");

    public static final Target COUNTRY = Target
            .the("the droplist of country")
            .locatedBy("//*[@id='select2-shipping_country-container']");


    public static final Target DEPARTAMENT = Target
            .the("the droplist of departament")
            .locatedBy("//*[@id='select2-shipping_state-container']");


    public static final Target CITY = Target
            .the("the droplist of city")
            .locatedBy("//*[@id='select2-shipping_city-container']");


    public static final Target ADDRESS = Target
            .the("the field of address")
            .locatedBy("//*[@id='shipping_address_1']");


    public static final Target BTN_SAVE = Target
            .the("the btn to save")
            .locatedBy("//div[@class='woocommerce-address-fields']//button");


}
