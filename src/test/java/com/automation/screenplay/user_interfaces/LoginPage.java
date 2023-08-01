package com.automation.screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USER_NAME = Target.the("User Name field")
            .located(By.id("user-name"));

    public static final Target USER_PASSWORD = Target.the("User Password field")
            .located(By.id("password"));

    public static final Target LOGIN_BTN = Target.the("Submit login")
            .located(By.id("login-button"));

}
