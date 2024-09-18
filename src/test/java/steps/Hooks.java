package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{
	@Before
	public void before(Scenario sc) {
		System.out.println("The scenario name is " +sc.getName());
		System.out.println("The scnario ID is :" +sc.getId());
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase("taps");
		test.assignCategory("Smoke");
		test.assignAuthor("Sandeep");
		startApp("chrome",false);
	}
	@After
	public void after(Scenario sc) {
		System.out.println("The status is " +sc.getStatus());
		System.out.println("the failed status is " +sc.isFailed());
		endResult();
		closeAllBrowsers();
		
	}

}
