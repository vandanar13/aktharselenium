package testScripts;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_04_Test extends BaseClass{
	
	@Test
	
	public void createContactWithMandField() {
		
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
		home.getContactLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on contact link");
		
		contact.getCreateContactLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on createcontact link");
		
		String lastName = "Gowda"+randomNum;
		contact.getLastName().sendKeys(lastName);
		ListenerImplemention.logger.log(Status.INFO, "entering the lastName ");
		
		contact.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on save buuton");
		
		if(contact.getFinalConfirmationtext().getText().contains(lastName))
		ListenerImplemention.logger.log(Status.PASS, "The contact is created ");
		else
		ListenerImplemention.logger.log(Status.FAIL, "The contact is not created");
	}

}
