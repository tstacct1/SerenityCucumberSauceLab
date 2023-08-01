package com.automation.screenplay.tasks;

import com.automation.screenplay.user_interfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToUserInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON_IN_CART));
    }

    public static GoToUserInfo navigation() {
        return instrumented(GoToUserInfo.class);
    }

}
