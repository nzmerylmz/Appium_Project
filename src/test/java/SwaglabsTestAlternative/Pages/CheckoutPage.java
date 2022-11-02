package pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckoutPage extends SwagLabsBase{

	public CheckoutPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\\\"test-First Name\\\"]")
	public WebElement firstName;
	
	public void verifyCheckOut() {
		verifyElementDisplayed(firstName);
	}
	
	public void firstNameInput(String text) {
		clear(firstName);
		sendText(firstName, text);
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\\\"test-Last Name\\\"]")
	public WebElement lastName;
	
	public void lastNameInput(String text) {
		clear(lastName);
		sendText(lastName, text);
	}

	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\\\"test-Zip/Postal Code\\\"]")
	public WebElement zipCode;
	
	public void zipCodeInput(String text) {
		clear(zipCode);
		sendText(zipCode, text);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-CONTINUE\\\"]")
	public WebElement continueBtn;
	
	public void continueBtn() {
		click(continueBtn);
	}

}
