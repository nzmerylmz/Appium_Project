package SwaglabsTestAlternative.Pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OrderPage extends SwagLabsBase{

	public OrderPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Price\"]/android.widget.TextView")
	public WebElement orderPrice;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]/android.view.ViewGroup/android.widget.TextView[5]")
	public WebElement itemTotalPrice;
	
	public void verifyCheckOutOverview() {
		verifyElementContains(itemTotalPrice, orderPrice);
	}
		
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-FINISH\\\"]")
	public WebElement finishOrder;
	
	public void finishOrder() {
		click(finishOrder);
	}
	
	@AndroidFindBy(xpath="//android.widget.ScrollView[@content-desc=\\\"test-CHECKOUT: COMPLETE!\\\"]/android.view.ViewGroup/android.widget.TextView[1]")
	public WebElement orderMessage;
	
	public void orderMessageVerify() {
		verifyElementDisplayed(orderMessage);;
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-BACK HOME\\\"]")
	public WebElement backHome;
	
	public void backHome() {
		click(backHome);
	}

}
