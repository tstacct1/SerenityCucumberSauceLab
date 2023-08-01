package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class CheckOutVerification implements Question<String[]>{

    @Override
    public String[] answeredBy(Actor actor) {
        String productName = TextContent.of(CheckOutPage.PROD_NAME).answeredBy(actor).toString();
        String productPrice = TextContent.of(CheckOutPage.PROD_PRICE).answeredBy(actor).toString();
        String headerPayment = TextContent.of(CheckOutPage.HEADER_PAYMENT).answeredBy(actor).toString();
        String headerShipping = TextContent.of(CheckOutPage.HEADER_SHIPPING).answeredBy(actor).toString();
        String headerTotal = TextContent.of(CheckOutPage.HEADER_TOTAL).answeredBy(actor).toString();
        return new String[] {productName, productPrice, headerPayment, headerShipping, headerTotal};
    }

    public static CheckOutVerification displayed() {
        return new CheckOutVerification();
    }

}
