package co.com.homecenter.models;

public class HomecenterHomePageModel {
	String productName;
	String productIndex;
	String productDescription;
	public HomecenterHomePageModel(String productName, String productIndex) {
		super();
		this.productName = productName;
		this.productIndex = productIndex;
		this.productDescription="";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProducIndex() {
		return productIndex;
	}

	public void setProducIndex(String producIndex) {
		this.productIndex = producIndex;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}