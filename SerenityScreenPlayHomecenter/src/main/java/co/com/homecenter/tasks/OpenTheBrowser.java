package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{

	private PageObject page;
	public OpenTheBrowser (PageObject page) {
		this.page = page;
	}
	
	@Step("")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
}
