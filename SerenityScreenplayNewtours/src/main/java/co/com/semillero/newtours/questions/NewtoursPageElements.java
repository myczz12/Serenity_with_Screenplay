package co.com.semillero.newtours.questions;

import java.util.List;
import static co.com.semillero.newtours.userinterfaces.NewtoursLoginComponents.YOUR_DESTINATION;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NewtoursPageElements implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(YOUR_DESTINATION).
				viewedBy(actor).
				asList();
	}
	
	public static Question<List<String>> displayed() {
        return new NewtoursPageElements();
    }
}
