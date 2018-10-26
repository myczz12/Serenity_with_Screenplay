package co.com.semillero.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.semillero.newtours.userinterfaces.NewtoursLoginComponents.SIGN_IN_BUTTON;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Clicks implements Task{
	private Target loginButton;

	public Clicks(Target loginButton) {
		super();
		this.loginButton = loginButton;
	}

	@Step("{0} clicks on Sign-in button")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SIGN_IN_BUTTON));
				Click.on(loginButton);
	}
	public static Clicks on(Target loginButton) {
		return instrumented(Clicks.class, loginButton);
	}
}
