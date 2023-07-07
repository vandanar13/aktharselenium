package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[text()='Organizations' and contains(@href,'action=index')]")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath = "//a[text()='Leads' and contains(@href,'action=index')]")
	private WebElement leadLink;
	
	@FindBy(id = "qccombo")
	private WebElement quickCreateDropdown;
	
    @FindBy(name = "subject")
	private WebElement subjectTextField;
	
    @FindBy(name = "date_start")
	private WebElement datastartTF;

	@FindBy(name = "due_date")
	private WebElement endDataTF;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	
	
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getLeadLink() {
		return leadLink;
	}

	public WebElement getQuickCreateDropdown() {
		return quickCreateDropdown;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getDatastartTF() {
		return datastartTF;
	}

	public WebElement getEndDataTF() {
		return endDataTF;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	}

	
	
	
	
	


