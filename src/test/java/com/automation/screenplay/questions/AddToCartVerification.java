package com.automation.screenplay.questions;

import com.automation.screenplay.user_interfaces.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class AddToCartVerification implements Question<String[]>{

    @Override
    public String[] answeredBy(Actor actor) {
        String productCount = TextContent.of(CartPage.ITEM_COUNT_IN_CART).answeredBy(actor).toString();
        String productNameInCart = TextContent.of(CartPage.PROD_NAME_IN_CART).answeredBy(actor).toString();
        String productPriceInCart = TextContent.of(CartPage.PROD_PRICE_IN_CART).answeredBy(actor).toString();  
        return new String[] {productCount, productNameInCart, productPriceInCart};
    }

    public static AddToCartVerification displayed() {
        return new AddToCartVerification();
    }

}
