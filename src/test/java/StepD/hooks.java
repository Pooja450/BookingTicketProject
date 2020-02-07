package StepD;

import Reports.Reporting;
import TestINIT.TestIn;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	
	
	
	@Before
	public void before(Scenario sc) {
		System.out.println("I am before hook");
		
		Reporting.initReports(sc.getName());
		
	}
	
	@After
	public void after() {
		System.out.println("I am after hook");
	}
	
}
