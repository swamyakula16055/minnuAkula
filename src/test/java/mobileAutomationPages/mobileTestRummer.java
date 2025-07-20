package mobileAutomationPages;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/mobileAutomationPages/features/mobileLogin.feature",
        glue = {"mobileAutomationPages.stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true,
        monochrome=true,
        dryRun=false
)

public class mobileTestRummer extends AbstractTestNGCucumberTests {

}
