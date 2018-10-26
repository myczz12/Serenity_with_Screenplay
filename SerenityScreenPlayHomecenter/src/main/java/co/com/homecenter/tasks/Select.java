package co.com.homecenter.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.homecenter.UI.HomecenterProducPageElements;
import co.com.homecenter.models.HomecenterHomePageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Select implements Task {
	
	private HomecenterHomePageModel homecenterModel;
	public Select(HomecenterHomePageModel homecenterModel) {
		super();
		this.homecenterModel = homecenterModel;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomecenterProducPageElements.PRODUCT_CONTAINER.of(homecenterModel.getProducIndex())));
		String productDescription = Text.of(HomecenterProducPageElements.PRODUCT_CONTAINER.of(homecenterModel.getProducIndex())).viewedBy(actor).asString();
		homecenterModel.setProductDescription(productDescription);
		System.out.println(productDescription);
		actor.attemptsTo(Click.on(HomecenterProducPageElements.TAGGED_PRODUCT.of(homecenterModel.getProducIndex())));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(HomecenterProducPageElements.CLOSE_PREVIEW_BUTTON));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(HomecenterProducPageElements.SHOPPING_CART_BUTTON));
	}
	
	public static Select item(HomecenterHomePageModel homecenterModel) {
		return instrumented(Select.class, homecenterModel);
	}
}
