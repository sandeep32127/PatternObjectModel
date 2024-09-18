package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how = How.LINK_TEXT,using = "Create Lead")
	WebElement createlead;
	//@And("click on the create Lead button")
	public CreateLead MyLeads() {
		click(createlead);
		return new CreateLead();
	}
	
	@FindBy(how = How.XPATH,using = "(//a[@class='linktext'])[4]")
	WebElement banu;
	public ViwLead MyleadsList() {
		click(banu);
		return new ViwLead();
	}
	@FindBy(how = How.LINK_TEXT,using = "Find Leads")
	WebElement findleads;
	public FindLead FindLeads() {
		click(findleads);
		return new FindLead();
	}
	@FindBy(how = How.LINK_TEXT,using = "Merge Leads")
	WebElement clickmergeleAD;
	public MergeLead clickMergeLeads() {
		click(clickmergeleAD);
		return new MergeLead();
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
