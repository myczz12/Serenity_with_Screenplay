package co.com.homecenter.questions;

import static co.com.homecenter.UI.HomecenterProducPageElements.PRODUCT_SECTION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductIs implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Text.of(PRODUCT_SECTION).viewedBy(actor).asString();
		
	}

	public static ProductIs displayed() {
        return new ProductIs();
    }
}
