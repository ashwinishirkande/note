package Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarydemologinpage {
	@FindBy(id="Course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;

	public Skillrarydemologinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void selenium() 
	{
		seleniumtraining.click();
	}

}
