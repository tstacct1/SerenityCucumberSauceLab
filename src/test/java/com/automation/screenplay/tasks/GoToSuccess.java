package com.automation.screenplay.tasks;

import com.automation.screenplay.user_interfaces.CheckOutPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToSuccess implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckOutPage.FINISH_BUTTON));
    }

    public static GoToSuccess navigation() {
        return instrumented(GoToSuccess.class);
    }

}
