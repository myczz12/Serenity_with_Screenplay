package co.com.semillero.newtours.tasks;

import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.ADDRESS1_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.CITY_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.CONFIRM_PASSWORD_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.COUNTRY_LIST;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.EMAIL_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.FIRSTNAME_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.LASTNAME_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.PASSWORD_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.PHONE_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.POSTALCODE_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.STATE_FIELD;
import static co.com.semillero.newtours.userinterfaces.NewtoursRegisterComponents.USERNAME_FIELD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.semillero.newtours.models.RegisterPageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class EnterRegisterData implements Task{
	private RegisterPageModel registerPageModel;
	
	public EnterRegisterData(RegisterPageModel registerPageModel) {
		super();
		this.registerPageModel = registerPageModel;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(registerPageModel.getFirstName()).into(FIRSTNAME_FIELD),
				Enter.theValue(registerPageModel.getLastName()).into(LASTNAME_FIELD),
				Enter.theValue(registerPageModel.getPhone()).into(PHONE_FIELD),
				Enter.theValue(registerPageModel.getEmail()).into(EMAIL_FIELD),
				Enter.theValue(registerPageModel.getAddress1()).into(ADDRESS1_FIELD),
				Enter.theValue(registerPageModel.getCity()).into(CITY_FIELD),
				Enter.theValue(registerPageModel.getState()).into(STATE_FIELD),
				Enter.theValue(registerPageModel.getPostalCode()).into(POSTALCODE_FIELD),
				SelectFromOptions.byVisibleText(registerPageModel.getCountry()).from(COUNTRY_LIST),
				Enter.theValue(registerPageModel.getUserName()).into(USERNAME_FIELD),
				Enter.theValue(registerPageModel.getPassword()).into(PASSWORD_FIELD),
				Enter.theValue(registerPageModel.getcPass()).into(CONFIRM_PASSWORD_FIELD));
	}
	
	public static EnterRegisterData as(RegisterPageModel registerPageModel) {
		return instrumented(EnterRegisterData.class, registerPageModel);
	}
}
