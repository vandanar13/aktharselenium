package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import genericLibraries.BaseClass;
import genericLibraries.IAutoConstants;

public class ScreenshotUtility  extends BaseClass implements IAutoConstants{
	
	public static String takingScreenshot(String screenshotName) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		
		String idt = LocalDateTime.now().toString().replace(":", "-");
		String path = System.getProperty("user.dir")+SSPATH+screenshotName+" "+idt+".png";
		File destination = new File(path);
		FileUtils.copyFile(photo, destination);
		
		return path;
		}
	
} 

