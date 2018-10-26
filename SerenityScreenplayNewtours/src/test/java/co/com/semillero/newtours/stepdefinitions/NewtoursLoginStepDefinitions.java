package co.com.semillero.newtours.stepdefinitions;

import static co.com.semillero.newtours.exceptions.NoMatchingFlightDetailsTextIsVisible.NO_MATCHING_FLGHT_DETAILS_TEXT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.semillero.newtours.exceptions.NoMatchingFlightDetailsTextIsVisible;
import co.com.semillero.newtours.models.LoginPageModel;
import co.com.semillero.newtours.questions.FlightFinderPageElement;
import co.com.semillero.newtours.tasks.Clicks;
import co.com.semillero.newtours.tasks.EnterLoginData;
import co.com.semillero.newtours.tasks.OpenTheBrowser;
import co.com.semillero.newtours.userinterfaces.NewtoursHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;

public class NewtoursLoginStepDefinitions {
	@Managed(driver = "chrome", clearCookies = ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisBrowser;
	private Actor max = Actor.named("Max");
	private NewtoursHomePage newtoursHomepage;
	private Target loginButton;

	@Before
	public void setUp() {
		max.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Max navigate to the login page of Newtours$")
	public void thatMaxNavigateToTheLoginPageOfNewtours() {
		max.wasAbleTo(OpenTheBrowser.on(newtoursHomepage));
	}

	@When("^he enter Username and Password$")
	public void heEnterUsernameAndPassword(List<LoginPageModel> fields) {
		max.attemptsTo(EnterLoginData.as(fields.get(0)));
	}

	@And("^he clicks login button$")
	public void heClickLoginButton() {
		max.attemptsTo(Clicks.on(loginButton));
	}

	@Then("^he should see the flight finder page$")
	public void heShouldSeeTheFlightFinderPage() {
		max.should(seeThat(FlightFinderPageElement.displayed(), hasItem("SIGN-OFF"))
				.orComplainWith(NoMatchingFlightDetailsTextIsVisible.class, NO_MATCHING_FLGHT_DETAILS_TEXT));
	}
}