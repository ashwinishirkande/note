package Design;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util {
	
	public void dropdown(WebElement ele , String text)
	{
		
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}

	public void mouseover(WebDriver driver,WebElement ele)
	{
		Actions as=new Actions(driver);
		as.moveToElement(ele).perform();
	}
	
	public void dubleclick(WebDriver driver,WebElement ele)
	{
		Actions as=new Actions(driver);
		as.doubleClick(ele).perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement desc,WebElement src)
	{
		Actions as=new Actions(driver);
		as.dragAndDrop(desc, src).perform();
	}
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
		
	}
	
	public void switchback(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		
	}
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void scrollBar(WebDriver driver, int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void switchTab(WebDriver driver)
	{
	Set<String> child = driver.getWindowHandles();
	for(String b:child)
	{
		driver.switchTo().window(b);
	}
	}
	
	
}

