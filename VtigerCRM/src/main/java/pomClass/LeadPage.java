package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createLeadLink;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(name = "company")
	private WebElement companyName;
	
	@FindBy(xpath = "//img[@src='themes/images/FindDuplicates-Faded.gif']")
	private WebElement duplicateLink;
	
	@FindBy(xpath = "//input[normalize-space(@value)='Save']")
	private WebElement saveButton;
	
	@FindBy(id = "selectCurrentPageRec")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@value = 'Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicate;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement  finalConfirmationtext;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement finalConfirmation;

	
	
	public WebElement getFinalConfirmation() {
		return finalConfirmation;
	}

	public WebElement getDuplicate() {
		return duplicate;
	}

	public WebElement getFinalConfirmationtext() {
		return finalConfirmationtext;
	}

	public WebElement getDuplicateLink() {
		return duplicateLink;
	}

    public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getCreateLeadLink() {
		return createLeadLink;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	
	

}
