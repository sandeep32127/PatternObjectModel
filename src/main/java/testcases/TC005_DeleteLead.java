package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete Lead  using LeafTaps";
		testNodes="Leads";
		category="Sanity";
		authors="Sandeep";
		browserName="chrome";
		dataSheetName="TC005_DeleteLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void DeleteLeads(String uName,String pwd,String vName,String fName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.CRMSFAlink()
		.clickLeads()
		.FindLeads()
		.enterFirstname(fName)
		.clickFindleads()
		.clicKLeads()
		.deleteLead();
		/*.MyLeads()
		.enterCompanyname(compName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.selectSource()
		.SubmitLead();
		*/
		
	}
	

}
