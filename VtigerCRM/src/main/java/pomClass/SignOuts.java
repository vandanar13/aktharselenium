package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;


public class SignOuts {
	
	public SignOuts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutButton;
	
	
	public WebElement getAdminIcon() {
		return adminIcon;
	}
	
	public WebElement getSignOutButton() {
		return signOutButton;
	}

	
}
