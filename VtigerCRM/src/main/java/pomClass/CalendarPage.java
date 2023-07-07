package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
	
	public CalendarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calenderLink;
	
	@FindBy(xpath = "//td[text()='Week']")
	private WebElement weekLink;
	
	@FindBy(name = "viewOption")
	private WebElement ListedView;

	public WebElement getCalenderLink() {
		return calenderLink;
	}
	

	public WebElement getWeekLink() {
		return weekLink;
	}


	public WebElement getListedView() {
		return ListedView;
	}
	
	

}
