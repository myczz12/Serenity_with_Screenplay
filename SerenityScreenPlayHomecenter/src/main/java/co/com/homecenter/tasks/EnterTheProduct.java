package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.homecenter.UI.HomecenterHomePageElements;
import co.com.homecenter.models.HomecenterHomePageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class EnterTheProduct implements Task {
	
	private HomecenterHomePageModel homecenterModel;
	public EnterTheProduct(HomecenterHomePageModel homecenterModel) {
		super();
		this.homecenterModel = homecenterModel;
	}
	
	@Step("")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(homecenterModel.getProductName()).into(HomecenterHomePageElements.SEARCH_FIELD));
	}
	
	public static EnterTheProduct on(HomecenterHomePageModel homecenterModel) {
		return instrumented(EnterTheProduct.class, homecenterModel);
	}
}
