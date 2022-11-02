package pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends SwagLabsBase{

	public LoginPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-standard_user\\\"]/android.widget.TextView")
	public WebElement standarUser;
	
	public void standardUser() {
		click(standarUser);
	}
	
		
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
	public WebElement loginBtn;
	
	public void loginBtn() {
		click(loginBtn);
	}

}
