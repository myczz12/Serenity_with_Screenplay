package co.com.homecenter.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomecenterProducPageElements {
	public static final Target TAGGED_PRODUCT = Target.the("").locatedBy("//section[@class='item-list clearfix jq-itemList']//section[{0}]//div[3]//p[3]//a[1]");
	public static final Target PRODUCT_CONTAINER = Target.the("").locatedBy("//section[@class='item-list clearfix jq-itemList']//section[{0}]//div[2]");
	public static final Target CLOSE_PREVIEW_BUTTON = Target.the("").locatedBy("//div[@class='modal-content']//button[@type='button']");
	public static final Target SHOPPING_CART_BUTTON = Target.the("").locatedBy("//section[@id='minicartQuanlitySection']");
	public static final Target PRODUCT_SECTION = Target.the("").locatedBy("//section[@class='item-all']");
}
