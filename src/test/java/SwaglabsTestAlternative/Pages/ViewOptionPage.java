package pages;

import org.openqa.selenium.WebElement;

import appiumtests.SwagLabsBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewOptionPage extends SwagLabsBase {

	public ViewOptionPage(AppiumDriver appiumDriver) {
		super(appiumDriver);
		// TODO Auto-generated constructor stub
	}
	@AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\\\"test-enter a https url here...\\\"]")
	public WebElement url;
	
	public void urlInput(String text) {
		clear(url);
		sendText(url, text);
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\\\"test-GO TO SITE\\\"]")
	public WebElement navigateToSite;
	
	public void navigateToSite() {
		click(navigateToSite);
	}
	
	@AndroidFindBy(className ="android.webkit.WebView")
	public WebElement webView;
	
	public void webViewVerify() {
		verifyElementDisplayed(webView);;
	}

}
