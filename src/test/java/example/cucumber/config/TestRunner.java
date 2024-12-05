package example.cucumber.config;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/example/cucumber/features",
        glue = "example.cucumber.stepDefinitions"
)
public class TestRunner {

}
