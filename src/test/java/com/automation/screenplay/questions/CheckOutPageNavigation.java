package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class CheckOutPageNavigation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(CheckOutPage.HEADER_CHECKOUT_PAGE).answeredBy(actor).toString();
    }

    public static CheckOutPageNavigation displayed() {
        return new CheckOutPageNavigation();
    }
}
