package co.com.semillero.newtours.tasks;

import static co.com.semillero.newtours.exceptions.NoInternetConnection.NO_INTERNET_CONNECTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.hasItem;

import co.com.semillero.newtours.exceptions.NoInternetConnection;
import co.com.semillero.newtours.questions.NewtoursPageElements;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	private PageObject page;
	
	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}
	
	@Override
	//@Step("{0} opens the browser on Newtours Home Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(NewtoursPageElements.displayed(), hasItem("your destination")).orComplainWith(
				NoInternetConnection.class, NO_INTERNET_CONNECTION));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
}