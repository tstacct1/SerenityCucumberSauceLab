package com.automation.screenplay.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//@DefaultUrl("https://www.saucedemo.com/")
public class MainPage extends PageObject {

    public static final Target GET_LOGIN_SCREEN = Target.the("Log In Button")
            .locatedBy("//input[@id='login-button']");

    public static final Target HEADER_PROD_PAGE = Target.the("Heading Text Prodcts Page")
            .locatedBy("//span[text()='Products']");

    // public static By getProductWithName(String productName) {
    //     String xpathExpression = String.format("//div[@class='inventory_item_name' and text()='%s']", productName);
    //         return (By) By.xpath(xpathExpression);
    // }

    public static final Target PROD_NAME = Target.the("Product Name in Prodcuts Page")
            .locatedBy("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']");

    public static final Target PROD_PRICE = Target.the("Product Price in Prodcuts Page")
            .locatedBy("//div[@class='inventory_item_price' and text()='29.99']");

    public static final Target ADD_TO_CART_BUTTON = Target.the("Product Price in Prodcuts Page")
    .locatedBy("//div[@class='inventory_item_price' and text()='29.99']/following-sibling::button");
    // public static By getProductWithPrice(String productPrice) {
    //     String xpathExpression = String.format("//div[@class='inventory_item_price' and text()='%s']", productPrice);
    //         return (By) By.xpath(xpathExpression);
    // }

    // public static By getcorrespondingProdAddToCartButton(String productName, String productPrice) {
    //     String xpathExpression = String.format("//div[@class='inventory_item_price' and text()='%s']/following-sibling::button", productName, productPrice);
    //         return (By) By.xpath(xpathExpression);
    // }





}
