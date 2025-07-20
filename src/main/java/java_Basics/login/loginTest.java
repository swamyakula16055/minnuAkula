package java_Basics.login;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class loginTest {
    static WebDriver driver;
  //  static loginPage LoginPage;

    public static void login() throws IOException {
        loginPage.userLogin();
        loginPage.userLoginClick(driver);
        loginPage.userScreenshot(driver);
        loginPage.userAlert(driver);
        loginPage.switchWindow(driver);
        loginPage.userSelect(driver);
        loginPage.findElements(driver);

    }



}
