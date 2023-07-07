package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		//some characters r not readable so to make it readble use monochrome
		monochrome = true,
	    plugin = {"pretty" ,"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		glue = "stepdefs",
		tags = {"@Sanity"}
		
		
		
		)
public class TestRunner {

	
}
