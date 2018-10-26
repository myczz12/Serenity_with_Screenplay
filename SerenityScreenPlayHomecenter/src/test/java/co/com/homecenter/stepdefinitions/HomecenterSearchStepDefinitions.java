package co.com.homecenter.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.homecenter.UI.HomecenterHomePage;
import co.com.homecenter.UI.HomecenterProducPageElements;
import co.com.homecenter.models.HomecenterHomePageModel;
import co.com.homecenter.questions.ProductIs;
import co.com.homecenter.tasks.CancelPopUp;
import co.com.homecenter.tasks.Clicks;
import co.com.homecenter.tasks.EnterTheProduct;
import co.com.homecenter.tasks.OpenTheBrowser;
import co.com.homecenter.tasks.Select;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.findby.By;

import static org.hamcrest.Matchers.containsString;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class HomecenterSearchStepDefinitions {
	
	@Managed(driver = "chrome", clearCookies = ClearCookiesPolicy.BeforeEachTest)
	private WebDriver hisBrowser;
	private Actor casemiro = Actor.named("Casemiro");
	private HomecenterHomePage homecenterPage;
	private HomecenterHomePageModel homecenterModel;
	private Target cancelButton;
	private Target searchButton;
	
	@Before
	public void setUp() {
		casemiro.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Casemiro navigate to the homepage of Homecenter$")
	public void thatCasemiroNavigateToTheHomepageOfHomecenter() {
		casemiro.wasAbleTo(
				OpenTheBrowser.on(homecenterPage),
				CancelPopUp.on(cancelButton));
	}

	@When("^he enter in the search box the name of a product$")
	public void heEnterInTheSearchBoxTheNameOfAProduct(List<HomecenterHomePageModel> fields) {
		casemiro.attemptsTo(EnterTheProduct.on(fields.get(0)));
	}

	@When("^he clicks the search button$")
	public void heClicksTheSearchButton() {
		casemiro.attemptsTo(Clicks.the(searchButton));
	}
	
	@And("^he picks a product$")
	public void hePicksAProduct(List<HomecenterHomePageModel> fields) {
		casemiro.attemptsTo(Select.item(fields.get(0)));
	}

	@Then("^he should see the same product in the shopping cart$")
	public void heShouldSeeTheSameProductInTheShoppingCart() throws InterruptedException {
		//TODO
		casemiro.attemptsTo((Performable) seeThat(ProductIs.displayed(), containsString(homecenterModel.getProductDescription())));
		//casemiro.should(seeThat(ProductIs.displayed(), containsString(homecenterModel.getProductDescription())));
		System.out.println(homecenterModel.getProductDescription());
	}
}
