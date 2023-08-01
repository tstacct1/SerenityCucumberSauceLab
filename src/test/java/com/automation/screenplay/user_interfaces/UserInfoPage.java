package com.automation.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UserInfoPage {
  
    public static Target FIRST_NAME = Target.the("First Name In User Info")
    .locatedBy("//input[@id='first-name']");
   
    public static Target LAST_NAME = Target.the("Last Name In User Info")
    .locatedBy("//input[@id='last-name']");
    
    public static Target ZIP_CODE = Target.the("Zip Code In User Info")
    .locatedBy("//input[@id='postal-code']");

    public static Target CONTINUE_BUTTON_IN_USER_INFO = Target.the("Continue Button In User Info")
    .locatedBy("//input[@id='continue']");

}
