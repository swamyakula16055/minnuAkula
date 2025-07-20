import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="stepDefinitions",
        plugin = {"pretty","html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        publish = true,
        monochrome=true,
        tags = "practice",
        dryRun=false

)


public class mytestRunner extends AbstractTestNGCucumberTests {




}
