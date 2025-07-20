package mobileAutomationPages.stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobileAppPage {
    private static AndroidDriver driver;

    public mobileAppPage(AndroidDriver driver){
        mobileAppPage.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    static WebElement Login_username;



}
