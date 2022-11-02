package pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShoppingCartPage extends SwagLabsBase{

	public ShoppingCartPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Item\"]/android.widget.TextView")
	public WebElement shoppingCartAssertion;
	
	public void verifyShoppingCart() {
		verifyElementDisplayed(shoppingCartAssertion);;
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-REMOVE\\\"]")
	public WebElement removeItem;
	
	public void removeItem() {
		click(removeItem);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-CONTINUE SHOPPING\\\"]")
	public WebElement continueShopping;
	
	public void continueShopping() {
		click(continueShopping);
	}
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-CHECKOUT\\\"]")
	public WebElement goToCheckOut;
	
	public void goToCheckOut() {
		click(goToCheckOut);
	}

}
