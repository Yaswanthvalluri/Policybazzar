package TestRunner;
//import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
	@CucumberOptions(features={".//FeatureFile/policybazzar.feature"},
	glue= {"com.Policybazzar.StepDefination"},
	plugin= {"pretty", "html:reports/myreportss.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	dryRun = false,
	monochrome = true,
	publish = true
	//tags = "@regression"
	)

public class Runner extends AbstractTestNGCucumberTests{
	
}