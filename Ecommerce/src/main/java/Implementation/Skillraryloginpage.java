package Implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillraryloginpage {
	
	@FindBy(xpath="//a[text()='GEARS']")
	private WebElement gearbtn;
	
	@FindBy(xpath="//a[text()=' SkillRary Demo APP']")
	private WebElement demoapp;
	
	public Skillraryloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearbtn()
	{
		gearbtn.click();
	}
	
	public void demo()
	{
		demoapp.click();
	}

}
