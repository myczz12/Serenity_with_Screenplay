package com.newtours.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
//import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.newtours.demoaut.com/")
public class NewtoursPage extends PageObject{
	
//public static final Target BTNACEPTAR = Target.the("").located(By.id(""));
	
    @FindBy(name="userName")
    WebElementFacade entrerUsername;
    
    @FindBy(name="password")
    WebElementFacade entrerPassword;
    
    @FindBy(name="login")
    WebElementFacade loginBtn;
    
    @FindBy(xpath="//a[text()='SIGN-OFF']")
    WebElementFacade signOffBtn;
    
    public void typeUsername(String user) {
    	entrerUsername.type(user);
    }
    public void typePassword(String pass) {
    	entrerPassword.type(pass);
    }
    public void clickLoginBtn() {
    	loginBtn.click();
    }
    public boolean clickSignOffBtn() {
    	Boolean flag = false;
    	if (signOffBtn.isVisible()) {
    		flag = true;
    	}
    	return flag;
    }
}