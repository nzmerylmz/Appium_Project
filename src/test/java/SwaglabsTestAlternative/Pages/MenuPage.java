package SwaglabsTestAlternative.Pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends SwagLabsBase{

	public MenuPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-WEBVIEW\\\"]/android.widget.TextView")
	public WebElement webViewOption;
	
	public void webViewOption() {
		click(webViewOption);
	}
	@AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\\\"test-ALL ITEMS\\\"]/android.widget.TextView")
	public WebElement allItemsOption;
	
	public void allItemsOption() {
		click(allItemsOption);
	}
	
	@AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\\\"test-GEO LOCATION\\\"]/android.widget.TextView")
	public WebElement geoLocationOption;
	
	public void geoLocationOption() {
		click(geoLocationOption);
	}
	
	@AndroidFindBy(id ="com.android.permissioncontroller:id/permission_deny_button")
	public WebElement permissionDenyBtn;
	
	public void permissionDenyBtn() {
		click(permissionDenyBtn);
	}
	

}
