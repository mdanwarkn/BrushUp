package TestClasses;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LearnAPI.feature",
        glue = {"stepdefinitions","hooks"},
        tags = "@Smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {


}
