package Design;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	public Propertiesfile pdata=new Propertiesfile();
	public Util webdriverut=new Util();
	
	
	
	@BeforeMethod
	
	public void openApp() throws IOException
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	
	public void close()
	{
		
		driver.close();
	}

}
