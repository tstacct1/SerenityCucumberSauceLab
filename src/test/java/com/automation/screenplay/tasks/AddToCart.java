package com.automation.screenplay.tasks;

import com.automation.screenplay.user_interfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(
                        valueOf(MainPage.PROD_NAME), isPresent()),
                Click.on(MainPage.ADD_TO_CART_BUTTON));
    }

    public static AddToCart withProduct(String productName, String productPrice) {
        return instrumented(AddToCart.class, productName, productPrice);
    }

}
