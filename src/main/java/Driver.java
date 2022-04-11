import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        String testResults;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "78ac3949");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability("appPackage", "com.zengo.wallet");
        cap.setCapability("appActivity", "com.zengo.MainActivity");
        cap.setCapability("unlockType", "pattern");
        cap.setCapability("unlockKey", "12369");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(Elements.homeBtn)).click();
        driver.findElement(By.xpath(Elements.assetMngr)).click();
        driver.findElement(By.xpath(Elements.bitcoinBtn)).click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Dogecoin\"));"));
        driver.findElement(By.xpath(Elements.dogecoinBtn)).click();
        driver.findElement(By.xpath(Elements.closeMngr)).click();

        if (driver.findElement(By.xpath(Elements.dogecoinTxt)).isDisplayed() && !driver.findElement(By.xpath(Elements.bitcoincoinTxt)).isDisplayed()) {
            testResults = "Test Passed";
        }
        else
        {
            testResults = "Test Failed";
        }
        System.out.println(testResults);
    }
}