package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.SuccessPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SuccessPageNavigation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(SuccessPage.SUCCESS_PAGE_TEXT).answeredBy(actor).toString();
    }

    public static SuccessPageNavigation displayed() {
        return new SuccessPageNavigation();
    }
}
