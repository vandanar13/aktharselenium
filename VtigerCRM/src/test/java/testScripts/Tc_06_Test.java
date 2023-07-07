package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_06_Test extends BaseClass{
	
	@Test
	
	public void deleteLead() {
		
		home.getLeadLink().click();
		ListenerImplemention.logger.log(Status.INFO, "click on contact link");
		
		lead.getCheckBox().click();
		ListenerImplemention.logger.log(Status.INFO, "click on checkBox");
		
		lead.getDeleteButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click on deleteButton");
		
		web.switchToAccept();
		ListenerImplemention.logger.log(Status.INFO, "alert accept");
	
		}

}
