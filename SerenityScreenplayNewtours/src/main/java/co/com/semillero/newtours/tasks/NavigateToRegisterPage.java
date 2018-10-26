package co.com.semillero.newtours.tasks;

import static co.com.semillero.newtours.userinterfaces.NewtoursLoginComponents.REGISTER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class NavigateToRegisterPage implements Task{
	private Target registerPage;
	
	public NavigateToRegisterPage (Target registerPage) {
		this.registerPage = registerPage;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(REGISTER_BUTTON));
		Click.on(registerPage);
	}
	
	public static NavigateToRegisterPage on(Target registerPage) {
		return instrumented(NavigateToRegisterPage.class, registerPage);
	}

}
