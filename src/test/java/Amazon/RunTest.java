package Amazon;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@test", monochrome = true, dryRun = false, plugin = {"pretty", "html:target/cukeReports"})

public class RunTest {
}
