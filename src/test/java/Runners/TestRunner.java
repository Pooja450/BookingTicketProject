package Runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;

import Reports.ExtentManager;
import Reports.Reporting;
import TestINIT.TestIn;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "src/test/resources/Features", 
		glue = { "StepD" }, 
		// tags = {"@Ticket"}, 
		plugin = { "pretty", "html:target/cucumber-reports", "junit:target/cucumber-reports/Cucumber.xml",
	     "json:target/cucumber-reports/Cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		// plugin = {"pretty", "html:target/report/"},
		monochrome = true
)


public class TestRunner extends AbstractTestNGCucumberTests{
	
	public static ExtentReports report;
	

	@BeforeClass
	public void beforeclass() {
		TestIn.init();
		report = ExtentManager.setUp("//Users//poojabhandari//Desktop//SELENIUM_TRAINING//AUTOMATION_code//TicketBooking//target");
	} 
	
	@AfterClass
	public void afterclass() {
		Reporting.putReport();
		
	}
}
