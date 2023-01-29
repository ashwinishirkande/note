package Design;

import java.io.File;

import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	
	
	public void getPhoto(WebDriver driver, String name) throws Exception
	{
		Date d=new Date();
		String Current=(d.toString().replaceAll(":", "_"));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photoPath + Current +name +".png");
		FileUtils.copyFile(src, dest);
		
		
	}
	

}

