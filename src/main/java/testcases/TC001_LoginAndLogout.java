package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;
import pages.LoginPage;
import utils.Exel;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout1";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName);
		//.clickLogOut();		
		
		
	}
	
	@Test
	public void chkReadData() throws BiffException, IOException {
		Exel.getTestData("Sheet1", "TC001.xls");
	}

}
