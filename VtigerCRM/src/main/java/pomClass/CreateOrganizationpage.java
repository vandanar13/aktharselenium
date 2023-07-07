package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationpage {
	
	public CreateOrganizationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "accountname")
	private WebElement organizationName;
	
	@FindBy(name ="industry")
	private WebElement industryField;
	
	@FindBy(name = "accounttype")
	private WebElement typeField;
	
	@FindBy(xpath = "//input[normalize-space(@value)='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@value = 'T']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement finalConfirmationtext;
	
	@FindBy(name = "assigned_group_id")
	private WebElement assignedtoDropdown;
	
	
	
	public WebElement getAssignedtoDropdown() {
		return assignedtoDropdown;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getFinalConfirmationtext() {
		return finalConfirmationtext;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getIndustryField() {
		return industryField;
	}

	public WebElement getTypeField() {
		return typeField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
