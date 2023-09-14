package com.co.Demoblazo.tasks;

import com.co.Demoblazo.userinterfaces.IndexPage;
import com.co.Demoblazo.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

public class ShopppingCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(IndexPage.MENU_OPTION));
        actor.attemptsTo(Click.on(IndexPage.MENU_OPTION));
        actor.attemptsTo(Scroll.to(IndexPage.RESULT_PRODUCT));
        actor.attemptsTo(Click.on(IndexPage.RESULT_PRODUCT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(ProductPage.BTN_ADD));
        actor.attemptsTo(Click.on(ProductPage.BTN_ADD));
    }
    
    public static ShopppingCart add(){
        return Tasks.instrumented(ShopppingCart.class);
    }
}
