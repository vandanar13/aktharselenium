package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericLibraries.BaseClass;
import practice.ListenerImplemention;

@Listeners(practice.ListenerImplemention.class)
public class Tc_08_Test extends BaseClass{
	
	@Test
	
	public void newEvent() throws InterruptedException {
	
		home.getQuickCreateDropdown().click();
		ListenerImplemention.logger.log(Status.INFO, "click quick create dropdown");
		
		web.handlingDropDown(home.getQuickCreateDropdown(), "New Event");
		home.getSubjectTextField().sendKeys("demo");
		ListenerImplemention.logger.log(Status.INFO, "entering the subject field");
		
		web.enteringDataIntoElement("2023-07-27", home.getDatastartTF());
		ListenerImplemention.logger.log(Status.INFO, "entering the starting data");
		Thread.sleep(2000);
		
		web.enteringDataIntoElement("2023-07-29", home.getEndDataTF());
		ListenerImplemention.logger.log(Status.INFO, "entering the ending data");
		Thread.sleep(2000);
		
		home.getSaveButton().click();
		ListenerImplemention.logger.log(Status.INFO, "click save button");
	}
	

}
