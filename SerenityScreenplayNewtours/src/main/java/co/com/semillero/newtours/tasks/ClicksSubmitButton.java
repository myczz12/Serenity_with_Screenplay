package co.com.semillero.newtours.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.SUBMIT_BUTTON;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClicksSubmitButton implements Task{
	private Target submitButton;
	
	public ClicksSubmitButton(Target submitButton) {
		super();
		this.submitButton = submitButton;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SUBMIT_BUTTON));
				Click.on(submitButton);
	}
	
	public static ClicksSubmitButton on(Target submitButton) {
		return instrumented(ClicksSubmitButton.class, submitButton);
	}
}
