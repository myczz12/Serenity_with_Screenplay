package com.newtours.runners;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;

@Narrative(text={"In order to find a fligth on the site (http://www.newtours.demoaut.com/)",
				 "As a user",
				 "I want to be able to login and search for flights",
				 "And check if the website is safe with the credentials"})

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="resources/features",
		glue="com.newtours.stepDefinitions"
		)

public class WhenLoginOnNewtours {
	 @Managed(clearCookies=ClearCookiesPolicy.BeforeEachTest)//Works updating dependences
	    WebDriver driver;
}