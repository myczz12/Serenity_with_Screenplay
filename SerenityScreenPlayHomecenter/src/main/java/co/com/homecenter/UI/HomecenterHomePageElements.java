package co.com.homecenter.UI;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomecenterHomePageElements {
	public static final Target SEARCH_FIELD = Target.the("Search field").located(By.id("autocomplete-ajax"));
	public static final Target LENS_BUTTON = Target.the("Lens button").located(By.id("scrollInputShow"));
	public static final Target POPOVER_CANCEL_BUTTON = Target.the("Cancel button").located(By.id("onesignal-popover-cancel-button"));
}
