package co.com.semillero.newtours.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewtoursFlightFinderComponents {
	public static final Target SIGN_OFF_BUTTON = Target.the("Sign-off button").located(By.linkText("SIGN-OFF"));
	public static final Target ONE_WAY_RADIO_BUTTON = Target.the("One way flight type radio button").located(By.name("findFlights"));
	public static final Target PASSENGERS_LIST = Target.the("").located(By.name("passCount"));
	public static final Target DEPARTURE_LIST = Target.the("").located(By.name("fromPort"));
	public static final Target DATE_ON_MONTH = Target.the("").located(By.name("fromMonth"));
	public static final Target DATE_ON_DAY = Target.the("").located(By.name("fromDay"));
	public static final Target DESTINATION_LIST = Target.the("").located(By.name("toPort"));
	public static final Target RETURNING_DATE_MONTH = Target.the("").located(By.name("toMonth"));
	public static final Target RETURNING_DATE_DAY = Target.the("").located(By.name("toPort"));
	public static final Target SERVICE_CLASS_RADIO_BUTTON = Target.the("").located(By.name("servClass"));
	public static final Target AIRLINE_LIST = Target.the("").located(By.name("airline"));
}
