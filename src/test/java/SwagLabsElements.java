import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SwagLabsElements extends SwagLabsBase {

    public SwagLabsElements(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-standard_user\\\"]/android.widget.TextView")
    public WebElement standarUser;

    public void standardUser() {
        click(standarUser);
    }


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    public WebElement loginBtn;

    public void loginBtn() {
        click(loginBtn);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    public WebElement loginAssertion;

    public void verifyLogin() {
        verifyElementDisplayed(loginAssertion);
        ;
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\\\"test-ADD TO CART\\\"])[1]")
    public WebElement addToCartFirstItem;

    public void addToCartFirstItem() {
        click(addToCartFirstItem);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-Cart\\\"]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement shoppingCart;

    public void shoppingCart() {
        click(shoppingCart);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]/android.widget.TextView")
    public WebElement shoppingCartAssertion;

    public void verifyShoppingCart() {
        verifyElementDisplayed(shoppingCartAssertion);
        ;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-REMOVE\\\"]")
    public WebElement removeItem;

    public void removeItem() {
        click(removeItem);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-CONTINUE SHOPPING\\\"]")
    public WebElement continueShopping;

    public void continueShopping() {
        click(continueShopping);
    }

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\\\"test-ADD TO CART\\\"])[2]")
    public WebElement addToCartSecondItem;

    public void addToCartSecondItem() {
        click(addToCartSecondItem);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-CHECKOUT\\\"]")
    public WebElement goToCheckOut;

    public void goToCheckOut() {
        click(goToCheckOut);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\\\"test-First Name\\\"]")
    public WebElement firstName;

    public void verifyCheckOut() {
        verifyElementDisplayed(firstName);
    }

    public void firstNameInput(String text) {
        clear(firstName);
        sendText(firstName, text);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\\\"test-Last Name\\\"]")
    public WebElement lastName;

    public void lastNameInput(String text) {
        clear(lastName);
        sendText(lastName, text);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\\\"test-Zip/Postal Code\\\"]")
    public WebElement zipCode;

    public void zipCodeInput(String text) {
        clear(zipCode);
        sendText(zipCode, text);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-CONTINUE\\\"]")
    public WebElement continueBtn;

    public void continueBtn() {
        click(continueBtn);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Price\"]/android.widget.TextView")
    public WebElement orderPrice;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: OVERVIEW\"]/android.view.ViewGroup/android.widget.TextView[5]")
    public WebElement itemTotalPrice;

    public void verifyCheckOutOverview() {
        verifyElementContains(itemTotalPrice, orderPrice);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-FINISH\\\"]")
    public WebElement finishOrder;

    public void finishOrder() {
        click(finishOrder);
    }

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\\\"test-CHECKOUT: COMPLETE!\\\"]/android.view.ViewGroup/android.widget.TextView[1]")
    public WebElement orderMessage;

    public void orderMessageVerify() {
        verifyElementDisplayed(orderMessage);
        ;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-BACK HOME\\\"]")
    public WebElement backHome;

    public void backHome() {
        click(backHome);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-Menu\\\"]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement menu;

    public void menu() {
        click(menu);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-WEBVIEW\\\"]/android.widget.TextView")
    public WebElement webViewOption;

    public void webViewOption() {
        click(webViewOption);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\\\"test-enter a https url here...\\\"]")
    public WebElement url;

    public void urlInput(String text) {
        clear(url);
        sendText(url, text);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-GO TO SITE\\\"]")
    public WebElement navigateToSite;

    public void navigateToSite() {
        click(navigateToSite);
    }

    @AndroidFindBy(className = "android.webkit.WebView")
    public WebElement webView;

    public void webViewVerify() {
        verifyElementDisplayed(webView);
        ;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-ALL ITEMS\\\"]/android.widget.TextView")
    public WebElement allItemsOption;

    public void allItemsOption() {
        click(allItemsOption);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\\\"test-GEO LOCATION\\\"]/android.widget.TextView")
    public WebElement geoLocationOption;

    public void geoLocationOption() {
        click(geoLocationOption);
    }

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    public WebElement permissionDenyBtn;

    public void permissionDenyBtn() {
        click(permissionDenyBtn);
    }


}
