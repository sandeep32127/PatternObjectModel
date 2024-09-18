package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	WebElement editcompName;
	public EditLead enterCompanyName(String Data) {
		type(editcompName,Data);
		return this;
	}
	@FindBy(how = How.ID,using = "updateLeadForm_firstName")
	WebElement editfirstname;
	public EditLead enterfirstnames(String Data) {
		type(editfirstname,Data);
		return this;	
	}
	@FindBy(how = How.ID,using="updateLeadForm_lastName")
	WebElement editlastname;
	public EditLead enterLastnames(String Data) {
		type(editlastname,Data);
		return this;
	}
	@FindBy(how = How.NAME,using="submitButton")
	WebElement submitedit;
	public ViwLead clickUpdate() {
		click(submitedit);
		return new ViwLead();
	}
	

}
