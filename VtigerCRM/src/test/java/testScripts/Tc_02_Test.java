package testScripts;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import genericLibraries.ExcelUtility;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_02_Test extends BaseClass{

	
	@Test
	
	public void createOrganizationWithTypeAndIndustry() {
		
		Random random = new Random();
		int randomNum = random.nextInt(100);
	
        home.getOrganizationLink().click();
        ListenerImplemention.logger.log(Status.INFO, "click on orgniazation link");
        
		organization.getCreateOrganization().click();
		ListenerImplemention.logger.log(Status.INFO, "click on  createOrganization link");
		
		String orgName = "Tcs"+randomNum;
		createOrganization. getOrganizationName().sendKeys(orgName);
		ListenerImplemention.logger.log(Status.INFO, "entering the organizationName");
		
		web.selectReference(createOrganization.getIndustryField()).selectByValue("Banking");
		ListenerImplemention.logger.log(Status.INFO, "entering the industry field");
		
		web.selectReference(createOrganization.getTypeField()).selectByValue("Customer");
		ListenerImplemention.logger.log(Status.INFO, "entering the type field");
		
		/*createOrganization.getRadioButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on radioButton");
		
		web.handlingDropDown1(createOrganization.getAssignedtoDropdown(), 1);
		ListenerImplemention.logger.log(Status.INFO, "handling the dropdown");*/
		
		createOrganization.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on saveButton");
		
		if(createOrganization.getFinalConfirmationtext().getText().contains(orgName))
		ListenerImplemention.logger.log(Status.PASS, "The oranization is created with industry and type field ");
		else
		ListenerImplemention.logger.log(Status.FAIL, "The oranization is not created");
		
		
	}

	
}
