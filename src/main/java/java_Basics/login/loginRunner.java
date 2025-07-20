package java_Basics.login;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
    features = "java_Basics/login/login.feature",
        glue="java_Basics.login.loginSteps",
        tags="@loginT",
        plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        publish = true,
        monochrome=true
)

public class loginRunner extends AbstractTestNGCucumberTests {

}
