package co.com.semillero.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewtoursRegisterComponents {
	public static final Target USERNANME_CONFIRM = Target.the("Confirm username text").located(By.name(""));
	public static final Target FIRSTNAME_FIELD = Target.the("First name field").located(By.name("firstName"));
	public static final Target LASTNAME_FIELD = Target.the("Last name field").located(By.name("lastName"));
	public static final Target PHONE_FIELD= Target.the("Phone field").located(By.name("phone"));
	public static final Target EMAIL_FIELD = Target.the("Email field").located(By.name("userName"));
	public static final Target ADDRESS1_FIELD = Target.the("Address1 field").located(By.name("address1"));
	public static final Target CITY_FIELD = Target.the("City field").located(By.name("city"));
	public static final Target STATE_FIELD = Target.the("State field").located(By.name("state"));
	public static final Target POSTALCODE_FIELD = Target.the("PostalCode field").located(By.name("postalCode"));
	public static final Target COUNTRY_LIST = Target.the("Country list").located(By.name("country"));
	public static final Target USERNAME_FIELD = Target.the("Username field").located(By.name("email"));
	public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.name("password"));
	public static final Target CONFIRM_PASSWORD_FIELD = Target.the("Confirm password field").located(By.name("confirmPassword"));
	public static final Target SUBMIT_BUTTON = Target.the("Submit button").located(By.name("register"));
}
