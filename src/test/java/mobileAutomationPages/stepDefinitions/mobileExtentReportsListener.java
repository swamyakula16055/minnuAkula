package mobileAutomationPages.stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static mobileAutomationPages.stepDefinitions.mobileDriverFunctions.driver;

public class mobileExtentReportsListener {

        private static ExtentReports extent;
        private static ExtentTest featureTest;
        static ExtentTest scenarioTest;
        private static ExtentHtmlReporter htmlReporter;

        private static String reportPath = "test-output/ExtentReport.html";

        @Before
        public void beforeScenario(Scenario scenario) {
            if (extent == null) {
                htmlReporter = new ExtentHtmlReporter(reportPath);
                htmlReporter.config().setTheme(Theme.STANDARD);
                htmlReporter.config().setDocumentTitle("Automation Report");
                htmlReporter.config().setReportName("Test Execution Report");

                extent = new ExtentReports();
                extent.attachReporter(htmlReporter);
            }

            // Log scenario details in Extent Reports
            featureTest = extent.createTest(scenario.getName());
            scenarioTest = featureTest.createNode(scenario.getName());
        }

        @AfterStep
        public void afterStep(io.cucumber.java.Scenario scenario) {
//            if (scenario.isFailed()) {
//                // If the step fails, log it in the report with failure details
//                scenarioTest.fail("Step failed: " + scenario.getStatus());
//            } else {
//                // Log passed steps
//                scenarioTest.pass("Step passed: " + scenario.getStatus());
//            }
            if (scenario.isFailed()) {
                // Capture screenshot
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String screenshotPath = "screenshots/" + scenario.getName() + ".png";
                try {
                    FileUtils.copyFile(screenshot, new File(screenshotPath));
                    stepDefinitions.ExtentReportListener.scenarioTest.fail("Test Failed")
                            .addScreenCaptureFromPath(screenshotPath);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        @After
        public void tearDown() {
            if (extent != null) {
                extent.flush();  // Write everything to the Extent Report
            }
        }
    }


