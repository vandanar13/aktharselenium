package testScripts;

import java.util.Random;
import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_07_Test extends BaseClass{
	
	@Test
	
	public void createContactWithExistingOrg() {
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
		home.getContactLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on contact link");
		
		contact.getCreateContactLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on createcontact link");
		
		String lastName = "Gowda"+randomNum;
		contact.getLastName().sendKeys(lastName);
		ListenerImplemention.logger.log(Status.INFO, "entering the lastName ");
		
		String parentId = driver.getWindowHandle();
		
		contact.getAddOrganizationIcon().click();
		ListenerImplemention.logger.log(Status.INFO, "click on addorganization link ");
		
		web.switchingtargetPage(driver.getWindowHandles(), parentId);
		ListenerImplemention.logger.log(Status.INFO, "switching to parent page");
		
		contact.getOptionsFromOrg().click();
		ListenerImplemention.logger.log(Status.INFO, "click on existing orgnization");
		web.switchingBackToMain(parentId);
		
		contact.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on save button");
		
		if(contact.getFinalConfirmationtext().getText().contains(lastName))
			ListenerImplemention.logger.log(Status.PASS, "The create contact with existing org name ");
		else
		ListenerImplemention.logger.log(Status.FAIL, "The contact is not created");
		
	}

}
