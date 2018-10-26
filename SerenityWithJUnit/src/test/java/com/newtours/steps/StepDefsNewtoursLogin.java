package com.newtours.steps;

//import static com.newtours.driver.WebRemoteDriver.hisBrowser;
import static org.junit.Assert.assertTrue;

import com.newtours.pages.NewtoursPage;
import net.thucydides.core.annotations.Step;

public class StepDefsNewtoursLogin {
    NewtoursPage newtoursPage;
    
	@Step("Given a user open the Newtours homepage")             
    public void a_user_open_the_Newtours_homepage() {
		newtoursPage.open();
		//hisBrowser().on("");
    }
	@Step("When puts the Username as {0} and Password as {1}")
	public void puts_the_Username_as_and_Password_as(String userName, String password) {
        newtoursPage.typeUsername(userName);
        newtoursPage.typePassword(password);
    }
	@Step("And clicks on the Login button")
	public void clicks_on_the_Login_button() {
        newtoursPage.clickLoginBtn();
    }
	@Step("Then the user verify the {0} page")
	public void the_user_verify_the_page(String expected) {
        assertTrue("Can't find element (SIGN-OFF button)",newtoursPage.clickSignOffBtn());
    }
}