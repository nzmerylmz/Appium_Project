package SwaglabsTestAlternative;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class SwagLabsTestBase {
    AppiumDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    void setup() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi Note 8 Pro");
        cap.setCapability("udid", "7xtkwcx8nb8h75lz");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "com.swaglabsmobileapp");
        cap.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
        URL url;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Application Started");
    }

    @AfterClass
    void driverClose() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
        System.out.println("Test Ended");
    }

    public SwagLabsBase(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver=appiumDriver;
    }

    public void waitForVisitibility(WebElement element) {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(WebElement element) {
        waitForVisitibility(element);
        element.clear();
    }

    public void click(WebElement element) {
        waitForVisitibility(element);
        element.click();
    }

    public void sendText(WebElement element, String text) {
        waitForVisitibility(element);
        element.sendKeys(text);
    }

    public void verifyElementDisplayed(WebElement element) {
        waitForVisitibility(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyElementContains(WebElement element1,WebElement element2) {
        waitForVisitibility(element1);
        Assert.assertTrue(element2.getText().contains(element1.getText()));
    }

    public void verticalScrollDown(AppiumDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement verticalScroll=driver.findElement(AppiumBy.className("android.widget.ScrollView"));
        int centerX=verticalScroll.getRect().x+(verticalScroll.getSize().width/2);
        double startY=verticalScroll.getRect().y + (verticalScroll.getSize().height*0.9);
        double endY=verticalScroll.getRect().y + (verticalScroll.getSize().height*0.1);
        PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe=new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX,(int)startY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int)endY));
        swipe.addAction(finger.createPointerUp(0));
        driver.perform(Arrays.asList(swipe));
    }

    public void verticalScrollUp(AppiumDriver driver){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebElement verticalScroll=driver.findElement(AppiumBy.className("android.widget.ScrollView"));
        int centerX=verticalScroll.getRect().x+(verticalScroll.getSize().width/2);
        double startY=verticalScroll.getRect().y + (verticalScroll.getSize().height*0.9);
        double endY=verticalScroll.getRect().y + (verticalScroll.getSize().height*0.1);
        PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe=new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX,(int)endY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int)startY));
        swipe.addAction(finger.createPointerUp(0));
        driver.perform(Arrays.asList(swipe));
    }

}
