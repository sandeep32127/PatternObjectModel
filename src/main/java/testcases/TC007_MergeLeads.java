package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead  using LeafTaps";
		testNodes="Leads";
		category="Sanity";
		authors="Sandeep";
		browserName="chrome";
		dataSheetName="TC007_MergeLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void DeleteLeads(String uName,String pwd,String vName,String fName,String FNAME) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.CRMSFAlink()
		.clickLeads()
		.clickMergeLeads()
		.enterFromLead()
		.enterFirstNamE(fName)
		.clickFinDLeads()
		.clickAnyLead()
		.enterToLead()
		.enterFirstNamE(FNAME)
		.clickFinDLeads()
		.clickAnyLead()
		.clickMerge();
		/*.MyLeads()
		.enterCompanyname(compName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.selectSource()
		.SubmitLead();
		*/
		
	}
	

}
