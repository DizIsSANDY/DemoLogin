package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
		features = "src/resources/featurefiles",
		glue = {"stepdefination"},
		plugin = {"pretty" , "html:target/cucumber-reports"}
			
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests {
}
	