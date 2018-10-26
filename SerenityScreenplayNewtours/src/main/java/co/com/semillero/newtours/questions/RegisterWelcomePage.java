package co.com.semillero.newtours.questions;

import static co.com.semillero.newtours.userinterfaces.NewtoursFlightFinderComponents.SIGN_OFF_BUTTON;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterWelcomePage implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(SIGN_OFF_BUTTON)
				.viewedBy(actor)
				.asList();
	}
	public static Question<List<String>> displayed() {
        return new RegisterWelcomePage();
    }
}
