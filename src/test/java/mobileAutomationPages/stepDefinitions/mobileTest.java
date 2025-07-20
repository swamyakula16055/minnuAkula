package mobileAutomationPages.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileTest {

    AppiumDriver appiumDriver;
    AndroidDriver driver;
    @BeforeTest
    public void devicesetUp() throws MalformedURLException {
//        setUp();
        try {
            WebDriverManager.chromedriver().setup();
            //WebDriverManager.chromedriver().browserVersion("124.0.6367.82").setup();

            //  String chromeDriverPath = WebDriverManager.chromedriver().getBinaryPath();

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 9 Pro XL");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
          //  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.APP, "D:/APKFiles/ApiDemos-debug.apk");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            //  caps.setCapability("newCommandTimeout", 60000); // Increase timeout to 60 seconds

//            String chromeDriverPath = WebDriverManager.chromedriver().getBinaryPath();
//            caps.setCapability("chromedriverExecutable", chromeDriverPath);


            // caps.setCapability(MobileCapabilityType.APP, "/path/to/your/app.apk");
//            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//            caps.setCapability("appWaitDuration", "30000");
          //  URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        }
     catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (SessionNotCreatedException e) {
        System.err.println("Session not created: " + e.getMessage());
    }
    }

    @Test
    public void samp(){
        System.out.println("Hellooo");

        //        WebElement element= driver.findElement(By.xpath("//android.widget.TextView[@content-desc='App']"));
//        element.click();

    }




}
