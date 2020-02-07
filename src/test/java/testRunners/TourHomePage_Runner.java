package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue =     "stepDefinitions",
        plugin = { "pretty",
                   "html:target/cucumber-report/cucumber-pretty",
                   "json:target/cucumber-report/cucumberTestReport.json",
        },
        tags = {"@tourHomePage"},
        dryRun = false
)


public class TourHomePage_Runner {
}
