package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead  using LeafTaps";
		testNodes="Leads";
		category="Sanity";
		authors="Sandeep";
		browserName="chrome";
		dataSheetName="TC006_DuplicateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void DeleteLeads(String uName,String pwd,String vName,String fName,String localFname,String mCampaign) {
		
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
		.clickDuplead()
		.clickDuplicateLead()
		.enterLocalFname(localFname)
		.selectMcampain(mCampaign)
		.clickingDupLead();
		/*.MyLeads()
		.enterCompanyname(compName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.selectSource()
		.SubmitLead();
		*/
		
	}
	

}
