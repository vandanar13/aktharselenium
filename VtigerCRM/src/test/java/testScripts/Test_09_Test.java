package testScripts;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

@Listeners(practice.ListenerImplemention.class)
public class Test_09_Test extends BaseClass{
	
	@Test
	
	public void Delete() throws InterruptedException {
		Random random = new Random();
		int randomNum = random.nextInt(100);
		
		
		home.getLeadLink().click();
		
		lead.getCreateLeadLink().click();
		
		String lastName = "Gowda"+randomNum;
		lead.getLastName().sendKeys(lastName);
		
		String company = "TCS"+randomNum;
		lead.getCompanyName().sendKeys(company);
		
		lead.getSaveButton().click();
		
		lead.getDuplicate().click();
		
		lead.getSaveButton().click();
		
		lead.getDeleteButton().click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		WebElement checkBox = driver.findElement(By.xpath("//a[contains(text(),'"+lastName+"')]/../..//input[@name='selected_id']"));
		checkBox.click();
		lead.getDeleteButton().click();
		
		driver.switchTo().alert().accept();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
		
	}

}
