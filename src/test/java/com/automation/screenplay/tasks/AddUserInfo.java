package com.automation.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddUserInfo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static GoToCart navigation() {
        return instrumented(GoToCart.class);
    }

}
