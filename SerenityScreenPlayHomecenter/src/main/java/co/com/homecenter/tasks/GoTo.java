package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {
	private Target googleSearch;
	
	public GoTo (Target googleSearch) {
		this.googleSearch = googleSearch;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(),
				Click.on(googleSearch)
				);
	}
	public static GoTo the(Target googleApp) {
		return instrumented(GoTo.class, googleApp);
	}
}
