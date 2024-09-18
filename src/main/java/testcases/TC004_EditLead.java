package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead  using LeafTaps";
		testNodes="Leads";
		category="Sanity";
		authors="Sandeep";
		browserName="chrome";
		dataSheetName="TC004_EditLead";
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
		.MyleadsList()
		.EditLeads()
		.enterCompanyName(compName)
		.enterfirstnames(fName)
		.enterLastnames(lName)
		.clickUpdate();
		/*.MyLeads()
		.enterCompanyname(compName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.selectSource()
		.SubmitLead();
		*/
		
	}
	

}
