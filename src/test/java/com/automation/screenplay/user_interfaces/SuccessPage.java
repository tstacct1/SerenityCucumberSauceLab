package com.automation.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SuccessPage {
  
    public static Target SUCCESS_PAGE_TEXT = Target.the("Thank You Text in Success Page")
    .locatedBy("//h2[text()='Thank you for your order!']");

   
}
