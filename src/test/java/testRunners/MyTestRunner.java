package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures/HomePage.feature"},
		glue= {"stepdefinations", "AppHooks"},
		plugin= {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
				},
		dryRun= false
		
		
		
		)

public class MyTestRunner {
	
}