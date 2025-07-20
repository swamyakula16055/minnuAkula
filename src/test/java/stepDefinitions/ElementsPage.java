package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class ElementsPage {

    private static WebDriver driver;

    public ElementsPage(WebDriver driver) {
        ElementsPage.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@name='username']")
    private static WebElement Login_username;

    @FindBy(xpath = "//input[@name='password']")
    private static WebElement Login_password;

    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement Loginbutton;

    //@FindBy(xpath = "//a[@class='oxd-main-menu-item active' and contains(@href, 'viewAdminModule')]")
   @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
    private static WebElement admin_menu;

 //   @FindBy(xpath = "//div[@class='orangehrm-header-container']//button")
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private static WebElement admin_add_button;

   // @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private static WebElement admin_userrole;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and text()='Admin']")
    private static WebElement UserRole_Admin;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    private static WebElement admin_status;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    private static WebElement status_Enabled;

    @FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']//input")
    private static WebElement admin_employeeName;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input')])[2]")
    private static WebElement admin_username;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'  and @type='password'])[1]")
    private static WebElement admin_password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    private static WebElement admin_confirmPassword;


    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement admin_save;



    public void sendKeys(WebElement element, String value) {
        element.sendKeys(value);
    }

//    public void click(WebElement element) {
//        element.click();
//    }

    public static void enterUsername(String userN) {
        //driver.findElement((By) Login_username).sendKeys(userN);
        Login_username.sendKeys(userN);

    }

    // Method to enter password
    public static void enterPassword(String passW) {
     //   driver.findElement((By) Login_password).sendKeys(passW);
        Login_password.sendKeys(passW);
    }

    // Method to click the login button
    public static void clickLogin() {
    //    driver.findElement((By) Loginbutton).click();
        Loginbutton.click();
    }

    public static void clickAdmin(){
      //  driver.findElement((By) admin_menu).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-main-menu-item' and contains(@href, 'viewAdminModule')]")));
        admin_menu.click();
    }

    public static void clickAddButton(){
     //   driver.findElement((By) admin_add_button).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")));
        admin_add_button.click();



    }

    public static void enterAllDetails() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")));

        admin_userrole.click();

        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));

// Step 3: Find and click the "Admin" option
        for (WebElement option : options) {
            if (option.getText().equals("Admin")) {
                option.click();
                break;
            }
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")));
        admin_status.click();

        List<WebElement> options2 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));

// Step 3: Find and click the "Admin" option
        for (WebElement optionz : options2) {
            if (optionz.getText().equals("Enabled")) {
                optionz.click();
                break;
            }
        }

       admin_employeeName.sendKeys("a");
        Thread.sleep(1000);
        List<WebElement> options3 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));

// Step 3: Click the second option in the dropdown
        if (options3.size() > 1) {
            options3.get(1).click();  // Index 1 represents the second option
        } else {
            System.out.println("The second option is not available.");
        }

       admin_username.sendKeys("swamyshivaaAkula");
       admin_password.sendKeys("swamyshiva123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")));
        admin_confirmPassword.sendKeys("swamyshiva123");

//       driver.findElement((By) admin_employeeName).sendKeys("Emma Taylor");
//       driver.findElement((By) admin_username).sendKeys("swamyshiva");
//       driver.findElement((By) admin_password).sendKeys("swamyshiva123");
//       driver.findElement((By) admin_confirmPassword).sendKeys("swamyshiva123");

    }


    public static void clickSave(){
      //  driver.findElement((By) admin_save).click();
        admin_save.click();

    }






}
