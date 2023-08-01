package com.automation.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {
  
    public static Target ITEM_COUNT_IN_CART = Target.the("Item Count In Cart")
    .locatedBy("//div[@id='shopping_cart_container']//span[text()='1']");
   
    public static Target PROD_NAME_IN_CART = Target.the("Product Name In Cart")
    .locatedBy("//div[@class='inventory_item_name']");
    
    public static Target PROD_PRICE_IN_CART = Target.the("Product Price In Cart")
    .locatedBy("//div[@class='inventory_item_price']");

    // public static Target REMOVE_BUTTON_IN_CART = Target.the("Remove Button In Cart")
    // .locatedBy("//button[text()='Remove']");

    // public static Target CONTINUE_BUTTON_IN_CART = Target.the("Continue Shopping Button In Cart")
    // .locatedBy("//button[@id='continue-shopping']");

    public static Target CHECKOUT_BUTTON_IN_CART = Target.the("Checkout Button In Cart")
    .locatedBy("//button[@id='checkout']");

}
