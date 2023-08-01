package com.automation.screenplay.tasks;

import com.automation.screenplay.user_interfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start implements Task {

    private MainPage mainPage;

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(mainPage));
    }

    public static Start prepareToSignIn() {
        return instrumented(Start.class, "Go to Login Screen", null);
    }

}
