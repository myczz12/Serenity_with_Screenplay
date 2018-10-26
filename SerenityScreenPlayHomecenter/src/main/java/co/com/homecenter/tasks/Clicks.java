package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.homecenter.UI.HomecenterHomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Clicks implements Task {
	
	Target searchButton;
	public Clicks(Target searchButton) {
		super();
		this.searchButton = searchButton;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(HomecenterHomePageElements.LENS_BUTTON));
	}
	
	public static Clicks the(Target searchButton) {
		return instrumented(Clicks.class, searchButton);
	}
}
