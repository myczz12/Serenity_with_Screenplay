package co.com.semillero.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewtoursLoginComponents {
	public static final Target YOUR_DESTINATION = Target.the("Your destination ref").located(By.linkText("your destination"));
	public static final Target REGISTER_BUTTON = Target.the("Register button").located(By.linkText("REGISTER"));
	public static final Target USERNAME_FIELD = Target.the("Username field").located(By.name("userName"));
	public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.name("password"));
	public static final Target SIGN_IN_BUTTON = Target.the("Sign-in button").located(By.name("login"));
}
