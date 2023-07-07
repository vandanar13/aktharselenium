package testScripts;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_03_Test extends BaseClass{
	
	@Test
	
	public void createLeadWithMandField(){
		
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
	    home.getLeadLink().click();
	    ListenerImplemention.logger.log(Status.INFO, "click on lead link");
		
		lead.getCreateLeadLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on createLead link");
		
		String lastName = "Gowda"+randomNum;
		lead.getLastName().sendKeys(lastName);
		ListenerImplemention.logger.log(Status.INFO, "entering the lastName");
		
		String company = "TCS"+randomNum;
		lead.getCompanyName().sendKeys(company);
		ListenerImplemention.logger.log(Status.INFO, "entering the companyName");
		
		lead.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on savebutton");
		
		if(lead.getFinalConfirmation().getText().contains(lastName))
		ListenerImplemention.logger.log(Status.PASS, "The lead is created ");
		else
		ListenerImplemention.logger.log(Status.FAIL, "The lead is not created");
		
		
       }
	
	
}
