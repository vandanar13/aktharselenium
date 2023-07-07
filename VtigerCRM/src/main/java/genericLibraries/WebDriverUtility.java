package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility extends BaseClass implements IAutoConstants {
	

	/*
	 * this is method is used for drag and drop purpose 
	 * @param src
	 * @param destination
	 */
	public void dragAndDropp(WebElement src, WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, destination).perform();
	}
	
	
	/*
	 * this method is used to perform right click action 
	 */
	public void rightClick() {
		Actions action = new Actions(driver);
		action.contextClick().perform();
	}
	
	
	/*
	 * this method used for perform right click operations with parameters
	 */
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	
	/*
	 * this method is used to perform double click on element 
	 */
     public void doubleClick() {
     Actions action = new Actions(driver);
	 action.doubleClick().perform();
	}
     
     
     /*
	 * this method is used to double click with parameters 
	 */
	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/*
	 * this method is used for mouse hover on element with passing an parameters
	 */
	public void mouseHoverOnElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	/*
	 * retrun the dropdown value  
	 */
	public Select selectReference(WebElement dropdown) {
		Select select = new Select(dropdown);
		return select;
	}
	
	/*
	 * This method is used to handaling the dropdown 
	 * mainly for selectbyVisableText method
	 * & SelectByValue method 
	 */
	public void handlingDropDown(WebElement dropdown , String value) {
		Select select = new Select(dropdown);
		try {
			select.selectByVisibleText(value);
		}catch (NoSuchElementException e) {
			select.selectByValue(value);
		}

	}
	
	/*
	 * This method is used to handaling the dropdwon which is having
	 * index value in dropdown
	 */
    public void handlingDropDown1(WebElement dropdown , int index) {
		Select select = new Select (dropdown);
		select.selectByIndex(index);
	}
    
    /*
	 * scroll the webpage by using scrollBy
	 */
	public void scrollingAction(int x , int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	/*
	 *Single click by using javascript executor
	 */
	public void clickonElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()",element);
	}
	
	/*
	 * It's act like sendKeys 
	 * basically used to send the data into filed
	 */
	public void enteringDataIntoElement(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '"+data+"'",element);
	}
	
	/*
	 * It's simular to clear 
	 * It's used to clear the text into filed
	 */
	public void clearingDataFromElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		js.executeScript("argument[0].value=' '",element);
	}
	
	/*
	 * It's used to Switch control into frame by using integer 
	 */
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	/*
	 * It's used to Switch control into frame by using element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/*
	 * It's used to Switch control into frame by using string
	 */
	public void switchingToFrame(String data) {
		driver.switchTo().frame(data);
	}
	
	/*
	 * It's used to Switch control to back to webpage (default page)
	 */
	public void switchingBackToMain() {
		driver.switchTo().defaultContent();
	}
	
	public void switchingBackToMain(String WindowID) {
		driver.switchTo().window(WindowID);
	}
	
	public void switchToAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	
	/*
	 * Switch the control into AlertPopup & Return the alert 
	 */
	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	public WebDriverWait explicitWaitingStatement(int longtime) {
	WebDriverWait wait = new WebDriverWait(driver, longtime);
	return wait;
	}
	
	/*
	 * its used to change mouse control into newpage or newtab
	 */
	public void switchToWindow(Set<String> allWindowID, String targetWindowTitile) {
		for (String id: allWindowID) {
			driver.switchTo().window(id);
			if(targetWindowTitile.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
			else {
				driver.close();
			}
			}
	}
		
	public void switchingtargetPage(Set<String> allWindowId, String parentId) {
		allWindowId.remove(parentId);
		for(String id:allWindowId) {
			driver.switchTo().window(id);
		}
		
	}
	
	/*public String takingScreenshot(String screenshotName) {
		TakesScreenshot ss =(TakesScreenshot)driver;
		File photo = ss.getScreenshotAs(OutputType.FILE);
		String idt = LocalDateTime.now().toString().replace(":","-");
		String path = System.getProperty("user.dir")+SSPATH+screenshotName+" "+idt+".png";
		File destination = new File(path);
		
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
		}*/
	
	

	}
	
	


	


