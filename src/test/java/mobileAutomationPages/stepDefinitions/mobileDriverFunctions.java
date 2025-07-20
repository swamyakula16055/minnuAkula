package mobileAutomationPages.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.ElementsPage;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileDriverFunctions {

    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public static mobileAppPage MobileAppPage;
    public static AppiumDriver appiumDriver;
    DesiredCapabilities caps;

    public void mobilesetUp() throws MalformedURLException {

        try {
            // WebDriverManager.chromedriver().setup();
            caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            //  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.APP, "D:/APKFiles/ApiDemos-debug.apk");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        }
//        catch (
//                SessionNotCreatedException e) {
//            System.err.println("Session not created: " + e.getMessage());
//        }

    }
}
