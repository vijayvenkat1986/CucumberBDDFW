package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber_html_report"},
		features={"features"},
		glue={"stepDefinitions"},
		tags={"@Vijay"}
		
		)
public class Runner {

	
}
