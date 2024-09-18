package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LeadsPage extends ProjectMethods{
	
	public LeadsPage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how = How.LINK_TEXT,using = "Leads")
	WebElement leads;
	//@And("click on the leads button in the leadspage")
	public MyLeads clickLeads() {
		click(leads);
		return new MyLeads();
	}
	
	
	
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	@FindBy(how = How.LINK_TEXT,using = "CRM/SFA")
	WebElement crmlink;
	public void CRMSFAlink() {
		click(crmlink);
	}*/
	
	/*@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}
	*/
	
	
	
	

}
