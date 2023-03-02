package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@auth",
        plugin = {"pretty", "html:target/reports/httpReport.html", "json:target/reports/jsonReport.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
