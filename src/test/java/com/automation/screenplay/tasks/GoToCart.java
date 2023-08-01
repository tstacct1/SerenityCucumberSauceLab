package com.automation.screenplay.tasks;

import com.automation.screenplay.user_interfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.ITEM_COUNT_IN_CART));
    }

    public static GoToCart navigation() {
        return instrumented(GoToCart.class);
    }

}
