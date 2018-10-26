package com.newtours.stepDefinitions;

import com.newtours.steps.NewtoursLoginSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginNewtoursStepDefinitions {
	
	@Steps
	NewtoursLoginSteps newtoursLoginSteps;
	
	@Given("^a user open the Newtours homepage$")
	public void a_user_open_the_Newtours_homepage() {
		newtoursLoginSteps.a_user_open_the_Newtours_homepage();
	}
	@When("^puts the Username as (.*) and Password as (.*)$")
	public void puts_the_Username_as_and_Password_as(String userN, String passW) {
		newtoursLoginSteps.puts_the_Username_as_and_Password_as(userN, passW);
	}
	@And("^clicks on the Login button$")
	public void clicks_on_the_Login_button() {
		newtoursLoginSteps.clicks_on_the_Login_button();
	}
	@Then("^the user verify the (.*) page$")
	public void the_user_verify_the_page(String expected) {
		newtoursLoginSteps.the_user_verify_the_page(expected);
	}
}
