package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class HomePageNavigation implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(MainPage.HEADER_PROD_PAGE).answeredBy(actor).toString();
    }

    public static HomePageNavigation displayed() {
        return new HomePageNavigation();
    }
}
