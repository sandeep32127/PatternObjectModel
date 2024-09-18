package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead  using LeafTaps";
		testNodes="Leads";
		category="Sanity";
		authors="Sandeep";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLeads(String uName,String pwd,String vName,String compName,String fName,String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.CRMSFAlink()
		.clickLeads()
		.MyLeads()
		.enterCompanyname(compName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.selectSource()
		.SubmitLead();
		
		
	}
	

}
