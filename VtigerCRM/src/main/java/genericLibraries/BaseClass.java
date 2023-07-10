package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomClass.CalendarPage;
import pomClass.Contactpage;
import pomClass.CreateOrganizationpage;
import pomClass.HomePage;
import pomClass.LeadPage;
import pomClass.LoginPage;
import pomClass.OrgnizationPage;
import pomClass.SignOuts;

public class BaseClass {

	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected static WebDriver driver;
	protected propertiesUtility ppt;
	protected ExtentReports report;

	protected HomePage home;
	protected OrgnizationPage organization;
	protected SignOuts signOut;
	protected Contactpage contact;
	protected LeadPage lead;
	protected CreateOrganizationpage createOrganization;
	protected LoginPage login;

	protected CalendarPage calender;

	@BeforeClass(alwaysRun = true)
	public void LauchingBrowser() throws IOException {
		ppt = new propertiesUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();
		report = new ExtentReports();

		if (ppt.readDataFromProperties("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.get(ppt.readDataFromProperties("url"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod(alwaysRun = true)
	public void navigatingToApplication() throws IOException {

		calender = new CalendarPage(driver);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		organization = new OrgnizationPage(driver);
		signOut = new SignOuts(driver);
		contact = new Contactpage(driver);
		lead = new LeadPage(driver);
		createOrganization = new CreateOrganizationpage(driver);

		login.getUserNameTF().sendKeys(ppt.readDataFromProperties("username"));
		login.getPasswordTF().sendKeys(ppt.readDataFromProperties("password"));
		login.getLoginButton().click();

	}

	@AfterClass
	public void tearDownMethod() {
		/*
		 * if(result.getStatus()==result.FAILURE) { String path =
		 * utility.takingScreenshot(result.getTestName()); }
		 */

		web.mouseHoverOnElement(signOut.getAdminIcon());
		signOut.getSignOutButton().click();

		driver.quit();
	}
}
