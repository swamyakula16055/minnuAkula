package java_Basics.login;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class loginPage {

    @FindBy(xpath = "//div")
    static WebElement login;

    @FindBy(xpath = "//div")
    static WebElement login1;

    @FindBy(xpath = "//div")
    static WebElement login2;

    @FindBy(xpath = "//div")
    static WebElement login3;


public loginPage(WebDriver driver){
    PageFactory.initElements(driver, this);

}

public static void userLogin(){
    login.sendKeys("swamy");

}

    public static void userLoginClick(WebDriver driver) throws IOException {
        login2.click();
    }

    //Screenshot
    public static void userScreenshot(WebDriver driver) throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("swamy/akula/swa.jpg"));
    }

    //Select class--- dropdown
    public static void userSelect(WebDriver driver) throws IOException {
        Select select= new Select(login2);
        select.selectByVisibleText("hi");
        select.selectByIndex(2);
        select.selectByValue("8");

    }

    //Actions class--- mousehover and dropdown
    public static void userActions(WebDriver driver) throws IOException {
        login2.click();
        Actions action= new Actions(driver);
        action.moveToElement(login3).build().perform();

        action.clickAndHold(login3)
                .moveToElement(login1)
                .release().build().perform();

        action.dragAndDrop(login1, login2).release().build().perform();
    }

    //Alert-- popup handle
    public static void userAlert(WebDriver driver) throws IOException {
        Alert alert= driver.switchTo().alert();
        String alertText=alert.getText();
        alert.accept();
        alert.accept();
        System.out.println(alertText);

    }

    //Switch to frame
    public static void SwitchFrame(WebDriver driver) throws IOException {

    WebElement eleFrame = driver.findElement(By.xpath("Hi"));
    driver.switchTo().frame(eleFrame);
    driver.switchTo().frame(0);
    driver.switchTo().frame("iFrame");

        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

    }

    //Switch to Windows
    public static void switchWindow(WebDriver driver) throws IOException {
      String parentWindow = driver.getWindowHandle();

        Set<String> allWindows= driver.getWindowHandles();
        for (String handle : allWindows){
            if (!handle.equals(parentWindow)){
                driver.switchTo().window(handle);
            }
        }

        driver.switchTo().window(parentWindow);



        Set<String> totalWindows= driver.getWindowHandles();
        Iterator<String> iterator=totalWindows.iterator();
        String pW= iterator.next();
        System.out.println(pW);
        String chW= iterator.next();
        System.out.println(chW);

        driver.switchTo().window(pW);
        driver.switchTo().window(chW);
        driver.switchTo().defaultContent();
    }

    //findElements
    public static void findElements(WebDriver driver){
    WebElement single= driver.findElement(By.xpath("fddger"));

        List<WebElement> elements=driver.findElements((By) login1);
        int size= elements.size();
        System.out.println(size);

        for (int i=0; i<size; i++){
            String listOfElements= elements.get(i).getText();

            System.out.println(listOfElements);

        }

    }

}
