package com.automation.screenplay.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;


public class UserRegister implements Ability {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public static UserRegister with(String firstName,String lastName, String zipCode){
        return new UserRegister(firstName, lastName, zipCode);
    }

    public static UserRegister as(Actor actor) throws Throwable {
        return actor.abilityTo(UserRegister.class);
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String zipCode() {
        return zipCode;
    }

    private UserRegister(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }
}
