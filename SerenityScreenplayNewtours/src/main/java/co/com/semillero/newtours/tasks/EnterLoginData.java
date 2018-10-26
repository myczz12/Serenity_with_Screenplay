package co.com.semillero.newtours.tasks;

import static co.com.semillero.newtours.userinterfaces.NewtoursLoginComponents.PASSWORD_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursLoginComponents.USERNAME_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.semillero.newtours.models.LoginPageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class EnterLoginData implements Task{
	
	private LoginPageModel loginPageModel;

	
	public EnterLoginData(LoginPageModel loginPageModel) {
		super();
		this.loginPageModel = loginPageModel;
	}

	@Step("{0} enter the data: Username as '#userName' and Password as '#password'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(loginPageModel.getUserName()).into(USERNAME_FIELD),
				Enter.theValue(loginPageModel.getPassword()).into(PASSWORD_FIELD));
	}
	
	public static EnterLoginData as(LoginPageModel loginPageModel) {
		return instrumented(EnterLoginData.class, loginPageModel);
	}
}
