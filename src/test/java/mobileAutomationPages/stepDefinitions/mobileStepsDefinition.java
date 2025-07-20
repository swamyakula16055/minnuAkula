package mobileAutomationPages.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import stepDefinitions.ElementsPage;
import stepDefinitions.ExtentReportListener;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileStepsDefinition extends mobileDriverFunctions{
    AndroidDriver driver;
    DesiredCapabilities caps;
   @Before
   public void mobileAppSetup() throws MalformedURLException {
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

           mobileExtentReportsListener.scenarioTest.pass("Navigated to the API Demo successfully");
           System.out.println("Mobile App Opened successfully");



       } catch (
               MalformedURLException e) {
           e.printStackTrace();
       }
//        catch (
//                SessionNotCreatedException e) {
//            System.err.println("Session not created: " + e.getMessage());
//        }

    }

    @Given("user navigate to APP menu in API Demos application")
    public void user_navigate_to_app_menu_in_api_demos_application() {
        WebElement app = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='App']"));
        app.click();
        mobileExtentReportsListener.scenarioTest.pass("Navigated to the APP menu successfully");

    }

    @When("user clicks on the loader tab")
    public void user_clicks_on_the_loader_tab() {

        WebElement loader = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Loader']"));
        loader.click();

        mobileExtentReportsListener.scenarioTest.pass("Navigated to the Loader tab successfully");

    }

    @Then("user clicks on the custom tab")
    public void user_clicks_on_the_custom_tab() {
        WebElement custom = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Custom']"));
        custom.click();
        mobileExtentReportsListener.scenarioTest.pass("Navigated to the custom tab successfully");

    }

    @Then("user clicks on the search button")
    public void user_clicks_on_the_search_button() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search']"));
        search.click();
        WebElement search_text = driver.findElement(By.id("android:id/search_src_text"));
        search_text.sendKeys("Android Setup");
        mobileExtentReportsListener.scenarioTest.pass("User clicked on search button successfully");


        //   Thread.sleep(50000);

//        driver.navigate().back();
//        WebElement Throttle = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Throttle']"));
//        Throttle.click();
//
//       String Text= "No data. Select 'Populate' to fill with data from Z to A at a rate of 4 per second.";

    }



}