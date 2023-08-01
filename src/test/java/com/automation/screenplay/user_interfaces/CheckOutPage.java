package com.automation.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {
  
    public static Target HEADER_CHECKOUT_PAGE = Target.the("Header in CheckOut Page")
    .locatedBy("//span[text()='Checkout: Overview']");

    public static Target PROD_NAME = Target.the("Product Name in CheckOut Page")
    .locatedBy("//div[@class='inventory_item_name']");

    public static Target PROD_PRICE = Target.the("Product Price in CheckOut Page")
    .locatedBy("//div[@class='inventory_item_price']");

    public static Target HEADER_PAYMENT = Target.the("Header Payment in CheckOut Page")
    .locatedBy("//div[text()='Payment Information']");

    public static Target HEADER_SHIPPING = Target.the("Header Shipping in CheckOut Page")
    .locatedBy("//div[text()='Shipping Information']");

    public static Target HEADER_TOTAL = Target.the("Header Total in CheckOut Page")
    .locatedBy("//div[contains(text(),'Total')]");

    public static Target FINISH_BUTTON = Target.the("Finish Button in CheckOut Page")
    .locatedBy("//button[@id='finish']");

}
