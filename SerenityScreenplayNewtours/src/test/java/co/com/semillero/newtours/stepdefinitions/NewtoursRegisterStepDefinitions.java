package co.com.semillero.newtours.stepdefinitions;

import static co.com.semillero.newtours.exceptions.UnsuccessfulRegisterEntry.UNSUCCESSFUL_REGISTER_ENTRY;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.semillero.newtours.exceptions.UnsuccessfulRegisterEntry;
import co.com.semillero.newtours.models.RegisterPageModel;
import co.com.semillero.newtours.questions.RegisterWelcomePage;
import co.com.semillero.newtours.tasks.ClicksSubmitButton;
import co.com.semillero.newtours.tasks.EnterRegisterData;
import co.com.semillero.newtours.tasks.NavigateToRegisterPage;
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

public class NewtoursRegisterStepDefinitions {
	@Managed(driver="chrome",clearCookies=ClearCookiesPolicy.BeforeEachTest)
	private WebDriver herBrowser;
	private Actor lory = Actor.named("Lory");
	private NewtoursHomePage newtoursHomepage;
	private Target registerPage;
	private Target submitButton;
	
	@Before
	public void setUp() {
		herBrowser.manage().window().maximize();
		lory.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Lory navigate to the register form of Newtours$")
	public void thatLoryNavigateToTheRegisterFormOfNewtours() {
		lory.wasAbleTo(
				OpenTheBrowser.on(newtoursHomepage),
				NavigateToRegisterPage.on(registerPage));	
	}

	@When("^she put the data in the correct order$")
	public void shePutTheDataInTheCorrectOrder(List<RegisterPageModel> registerFields) {
		lory.attemptsTo(EnterRegisterData.as(registerFields.get(0)));
	}

	@And("^she clicks the submit button$")
	public void sheClicksTheSubmitButton() {
		lory.attemptsTo(ClicksSubmitButton.on(submitButton));
	}

	@Then("^she should see the confirmation page$")
	public void sheShouldSeeTheConfirmationPage() {
		lory.should(seeThat(RegisterWelcomePage.displayed(), hasItem("SIGN-OFF")).orComplainWith(
				UnsuccessfulRegisterEntry.class, UNSUCCESSFUL_REGISTER_ENTRY));
	}
}
