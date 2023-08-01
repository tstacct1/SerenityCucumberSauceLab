package com.automation.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import com.automation.screenplay.abilities.UserRegister;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.automation.screenplay.user_interfaces.UserInfoPage.*;


public class Register implements Task {

    public static Register withUserInfo(){
        return instrumented(Register.class);
    }

    @Step
    public <T extends Actor> void performAs(T user) {
        try {
            user.attemptsTo(
                    Enter.theValue(registered(user).firstName())
                        .into(FIRST_NAME),
                    Enter.theValue(registered(user).lastName())
                        .into(LAST_NAME),
                    Enter.theValue(registered(user).zipCode())
                        .into(ZIP_CODE),
                    Click.on(CONTINUE_BUTTON_IN_USER_INFO)
            );
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private UserRegister registered(Actor actor) throws Throwable {
       return UserRegister.as(actor);
    }

}
