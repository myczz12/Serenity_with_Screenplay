package com.newtours.runners;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.newtours.steps.StepDefsNewtoursLogin;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;

@Narrative(text={"In order to find a fligth on the site (http://www.newtours.demoaut.com/)",
				 "As a user",
				 "I want to be able to login and search for flights",
				 "And check if the website is safe with the credentials"})

@RunWith(SerenityRunner.class)
public class WhenLoginOnNewtours {
	//uniqueSession=true
    @Managed(clearCookies=ClearCookiesPolicy.BeforeEachTest)//Works updating dependences
    WebDriver driver;

    @Steps//Call steps class
    StepDefsNewtoursLogin stepDefsNewtoursLogin;
    
    @Test
    public void shouldAbleToSeeTheFligthFinderPageOnNewtours() {
        //GIVEN
    	stepDefsNewtoursLogin.a_user_open_the_Newtours_homepage();
    	//WHEN
    	stepDefsNewtoursLogin.puts_the_Username_as_and_Password_as("pepito@abc.com", "12345");
    	//AND
    	stepDefsNewtoursLogin.clicks_on_the_Login_button();
    	//THEN
    	stepDefsNewtoursLogin.the_user_verify_the_page("successful");
    }
    
    @Test
    public void shouldFailTheLoginOnNewtours() {
        //GIVEN
    	stepDefsNewtoursLogin.a_user_open_the_Newtours_homepage();
    	//WHEN
    	stepDefsNewtoursLogin.puts_the_Username_as_and_Password_as("pepito@fake.com", "12345");
    	//AND
    	stepDefsNewtoursLogin.clicks_on_the_Login_button();
    	//THEN
    	stepDefsNewtoursLogin.the_user_verify_the_page("failure");
    }
}