package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty"},
		features={"features"},
		glue={"stepDefinitions"},
		//tags={"@Vijay","~@dev","~@wip","~@ignore"}
		tags={"@qafox"}
		
		
		)
public class Runner {

	
}
