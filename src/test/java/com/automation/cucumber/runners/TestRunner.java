package com.automation.cucumber.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags =  "@complete-order" ,
        glue = { "com.automation.cucumber.steps" }
)
public class TestRunner {}
