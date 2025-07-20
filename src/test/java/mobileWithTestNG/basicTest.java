package mobileWithTestNG;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class basicTest {


    public static AndroidDriver driver;

    @BeforeClass
    public void basiczTest() throws MalformedURLException {

        try {
            // WebDriverManager.chromedriver().setup();
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            //  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
            //    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            caps.setCapability(MobileCapabilityType.APP, "D:/APKFiles/ApiDemos-debug.apk");
            //    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

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

    @Test
    public void mobileDemo() {
       // System.out.println("Hellooo");

        WebElement app = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='App']"));
        app.click();


        WebElement loader = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Loader']"));
        loader.click();


    }

}