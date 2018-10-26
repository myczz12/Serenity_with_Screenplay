package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.homecenter.UI.HomecenterHomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class CancelPopUp implements Task{
	Target cancelButton;
	public CancelPopUp(Target cancelButton) {
		super();
		this.cancelButton = cancelButton;
	}
	
	@Step("")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomecenterHomePageElements.POPOVER_CANCEL_BUTTON));
	}
	
	public static CancelPopUp on(Target cancelButton) {
		return instrumented(CancelPopUp.class, cancelButton);
	}

}
