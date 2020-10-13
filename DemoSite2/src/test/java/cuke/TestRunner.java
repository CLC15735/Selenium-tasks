package cuke;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cuke",
					plugin = {"pretty", "html:target/reports/htmlReport"},
					monochrome = true)
public class TestRunner {
	
	public TestRunner() {
		
	}

}
