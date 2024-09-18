package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how = How.ID,using="createLeadForm_companyName")
	WebElement compName;
	//@And("Enter the company name as (.*)")
	public CreateLead enterCompanyname(String data) {
		type(compName,data);
		return this;
	}
	@FindBy(how = How.ID,using="createLeadForm_firstName")
	WebElement fName;
	//@And("Enter the first name of the lead as (.*)")
	public CreateLead enterFirstname(String data) {
		type(fName,data);
		return this;
	}
	@FindBy(how = How.ID,using="createLeadForm_lastName")
	WebElement lName;
	//@And("enter the last name of the lead as (.*)")
	public CreateLead enterLastname(String data) {
		type(lName,data);
		return this;
	}
	@FindBy(how = How.ID,using="createLeadForm_dataSourceId")
	WebElement sourceId;
	//@And("enter the source for the lead")
	public CreateLead selectSource() {
		selectDropDownUsingText(sourceId,"Direct Mail");
		return this;
	}
	@FindBy(how = How.CLASS_NAME,using = "smallSubmit")
	WebElement submit;
	//@When("click on the submit button")
	public ViwLead SubmitLead() {
		click(submit);
		return new ViwLead();
	}
	
	//@Then("create lead should be successfull")
	public void createLeaddone() {
		System.out.println("Create Lead is successfull");
	}
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}*/
	/*@FindBy(how = How.LINK_TEXT,using = "CRM/SFA")
	WebElement crmlink;
	public LeadsPage CRMSFAlink() {
		click(crmlink);
		return new LeadsPage();
	}*/
	
	/*@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	*/
	
	
	
	

}
