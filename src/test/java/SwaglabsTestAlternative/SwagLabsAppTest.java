package SwaglabsTestAlternative;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.OrderPage;
import pages.ProductPage;
import pages.ShoppingCartPage;
import pages.ViewOptionPage;

public class SwagLabsAppTest extends SwagLabsTestBase{
    public SwagLabsAppTest(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    LoginPage login;
    ProductPage product;
    ShoppingCartPage shoppingcart;
    CheckoutPage checkout;
    OrderPage order;
    MenuPage menu;
    ViewOptionPage viewOption;

    @Test
    void appTest(){
        login=new LoginPage(driver);
        product=new ProductPage(driver);
        shoppingcart=new ShoppingCartPage(driver);
        checkout=new CheckoutPage(driver);
        order=new OrderPage(driver);
        menu=new MenuPage(driver);
        viewOption=new ViewOptionPage(driver);
        verticalScrollDown(driver);
        login.standardUser();
        verticalScrollUp(driver);
        login.loginBtn();
        product.verifyLogin();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        product.addToCartFirstItem();
        product.shoppingCart();
        shoppingcart.verifyShoppingCart();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        shoppingcart.removeItem();
        shoppingcart.continueShopping();
        product.addToCartSecondItem();
        product.shoppingCart();
        verticalScrollDown(driver);
        verticalScrollUp(driver);
        shoppingcart.goToCheckOut();
        checkout.verifyCheckOut();
        checkout.firstNameInput("test");
        checkout.lastNameInput("user");
        checkout.zipCodeInput("123456");
        verticalScrollDown(driver);
        checkout.continueBtn();
        order.verifyCheckOutOverview();
        verticalScrollDown(driver);
        order.finishOrder();
        order.orderMessageVerify();
        order.backHome();
        product.menu();
        menu.webViewOption();
        viewOption.urlInput("https://www.google.com");
        viewOption.navigateToSite();
        viewOption.webViewVerify();
        product.menu();
        menu.allItemsOption();
        product.menu();
        menu.geoLocationOption();
        menu.permissionDenyBtn();
    }
}
