package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class stepsDefinition {
    public static  WebDriver driver;
    public static ElementsPage elementsPage;

    @Before
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("user navigates to orangeHrm url")
    public void user_navigates_to_orange_hrm_url() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        elementsPage=new ElementsPage(driver);
        ExtentReportListener.scenarioTest.pass("Navigated to the URL successfully");

        // new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(ElementsPage.Login_username));


    }
    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String username, String password) {
//        WebElement user= driver.findElement(By.xpath("//input[@name='username']"));
//        user.sendKeys(username);

        ElementsPage.enterUsername(username);

//        WebElement passW = driver.findElement(By.xpath("//input[@name='password']"));
//        passW.sendKeys(password);

        ElementsPage.enterPassword(password);
        ExtentReportListener.scenarioTest.pass("User entered the username and password");

    }
    @Then("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
//    WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
//    loginButton.click();

        ElementsPage.clickLogin();
        ExtentReportListener.scenarioTest.pass("Navigated to the Login Page successfully");



    }
    @Then("user navigates to admin page")
    public void user_navigates_to_admin_page() {
        String current="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String str=driver.getCurrentUrl();
        Assert.assertEquals(str, current);

    }

    @Then("click on the Admin in leftside menu")
    public void click_on_the_admin_in_leftside_menu() {
        ElementsPage.clickAdmin();

    }
    @Then("click on the Add button")
    public void click_on_the_add_button() {
        ElementsPage.clickAddButton();

    }

    @And("add all the required data")
    public void addAllTheRequiredData() throws InterruptedException {
    ElementsPage.enterAllDetails();
    }
    @Then("click on save button")
    public void click_on_save_button() {
    ElementsPage.clickSave();

    }



//    @After
//    public void tearDown(){
//        driver.quit();
//    }



}
