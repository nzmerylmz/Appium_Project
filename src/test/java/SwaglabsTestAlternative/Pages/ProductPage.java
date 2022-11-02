package SwaglabsTestAlternative.Pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends SwagLabsBase{

	public ProductPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
	public WebElement loginAssertion;
	
	public void verifyLogin() {
		verifyElementDisplayed(loginAssertion);;
	}
	
	@AndroidFindBy(xpath="(//android.view.ViewGroup[@content-desc=\\\"test-ADD TO CART\\\"])[1]")
	public WebElement addToCartFirstItem;
	
	public void addToCartFirstItem() {
		click(addToCartFirstItem);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-Cart\\\"]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement shoppingCart;
	
	public void shoppingCart() {
		click(shoppingCart);
	}
	@AndroidFindBy(xpath="(//android.view.ViewGroup[@content-desc=\\\"test-ADD TO CART\\\"])[2]")
	public WebElement addToCartSecondItem;
	
	public void addToCartSecondItem() {
		click(addToCartSecondItem);
	}
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-Menu\\\"]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement menu;
	
	public void menu() {
		click(menu);
	}

}
