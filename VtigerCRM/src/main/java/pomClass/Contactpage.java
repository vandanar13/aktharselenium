package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	
	
	public Contactpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactLink;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[normalize-space(@value)='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement  finalConfirmationtext;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement addOrganizationIcon;
	
	@FindBy(xpath = "//td[text()=' Administrator']")
	private WebElement optionsFromOrg;
	

	public WebElement getFinalConfirmationtext() {
		return finalConfirmationtext;
	}

	public WebElement getAddOrganizationIcon() {
		return addOrganizationIcon;
	}

	public WebElement getOptionsFromOrg() {
		return optionsFromOrg;
	}

	public WebElement getFinalConfirmationMsg() {
		return getFinalConfirmationMsg();
	}

	public WebElement getCreateContactLink() {
		return createContactLink;
	}

	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	
	
}
