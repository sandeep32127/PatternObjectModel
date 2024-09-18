package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	public DuplicateLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how = How.ID,using = "createLeadForm_firstNameLocal")
	WebElement locFname;
	public DuplicateLead enterLocalFname(String data) {
		type(locFname,data);
		return this;
	}
	@FindBy(how = How.ID,using = "createLeadForm_marketingCampaignId")
	WebElement mCamp;
	public DuplicateLead selectMcampain(String data) {
		selectDropDownUsingText(mCamp, data);
		return this;
	}
	@FindBy(how = How.CLASS_NAME,using = "smallSubmit")
	WebElement submit;
	public ViwLead clickingDupLead() {
		click(submit);
		return new ViwLead();
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
