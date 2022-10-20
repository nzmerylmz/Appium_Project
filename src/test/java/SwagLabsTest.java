import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;

public class SwagLabsTest extends SwagLabsBase {

    public SwagLabsTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @Test
    void appTest() {
        SwagLabsElements sl = new SwagLabsElements(driver);
        verticalScrollDown(driver);
        sl.standardUser();
        verticalScrollUp(driver);
        sl.loginBtn();
        sl.verifyLogin();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        sl.addToCartFirstItem();
        sl.shoppingCart();
        sl.verifyShoppingCart();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        sl.removeItem();
        sl.continueShopping();
        sl.addToCartSecondItem();
        sl.shoppingCart();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        sl.goToCheckOut();
        sl.verifyCheckOut();
        sl.firstNameInput("test");
        sl.lastNameInput("user");
        sl.zipCodeInput("123456");
        verticalScrollDown(driver);
        sl.continueBtn();
        sl.verifyCheckOutOverview();
        verticalScrollDown(driver);
        sl.finishOrder();
        sl.orderMessageVerify();
        sl.backHome();
        sl.menu();
        sl.webViewOption();
        sl.urlInput("https://www.google.com");
        sl.navigateToSite();
        sl.webViewVerify();
        sl.menu();
        sl.allItemsOption();
        sl.menu();
        sl.geoLocationOption();
        sl.permissionDenyBtn();
    }
}
