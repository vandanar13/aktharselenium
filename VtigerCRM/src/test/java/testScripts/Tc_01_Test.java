package testScripts;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_01_Test extends BaseClass{


	@Test
	
	public void createOrganizationWithMandField()  {
		
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
        home.getOrganizationLink().click();
        ListenerImplemention.logger.log(Status.INFO, "click on organization link");
        
		organization.getCreateOrganization().click();
		ListenerImplemention.logger.log(Status.INFO, "click on  createOrganization link");
	        
		String orgName = "Tcs"+randomNum;
		createOrganization. getOrganizationName().sendKeys(orgName);
		ListenerImplemention.logger.log(Status.INFO, "entering the organizationName");
	        
		createOrganization.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on save button");
	      
		if(createOrganization.getFinalConfirmationtext().getText().contains(orgName))
		ListenerImplemention.logger.log(Status.PASS, "The oranization is created ");
		else
		ListenerImplemention.logger.log(Status.FAIL, "The oranization is not created");
			
		
	}
	

}
