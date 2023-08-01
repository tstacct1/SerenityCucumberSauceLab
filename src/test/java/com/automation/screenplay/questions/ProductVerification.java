package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ProductVerification implements Question<String[]>{

    @Override
    public String[] answeredBy(Actor actor) {
        String productName = TextContent.of(MainPage.PROD_NAME).answeredBy(actor).toString();
        String productPrice = TextContent.of(MainPage.PROD_PRICE).answeredBy(actor).toString();
        return new String[] {productName, productPrice};
    }

    public static ProductVerification displayed() {
        return new ProductVerification();
    }

}
