package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/FeatureFile/Login.feature",
glue = "com.StepDefinition",monochrome=true,plugin = {"pretty", "html:target"})

public class TestRunner {

}
