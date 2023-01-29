package Script;


import org.testng.annotations.Test;

import Design.Baseclass;
import Implementation.Addtocartpage;
import Implementation.Skillrarydemologinpage;
import Implementation.Skillraryloginpage;



public class Testcase1 extends Baseclass
 {
	
  @Test
  
  public void tc1()
  {
	 Skillraryloginpage s=new Skillraryloginpage(driver);
	 s.gearbtn();
	 s.demo();
	 
	 Skillrarydemologinpage sd=new Skillrarydemologinpage(driver);
	 webdriverut.switchTab(driver);
	 webdriverut.mouseover(driver, sd.getCoursetab());
	 sd.selenium();
	 Addtocartpage ad=new Addtocartpage(driver);
	 webdriverut.dubleclick(driver, ad.getAddbtn());
	 ad.addtocartbutton();
	 webdriverut.alertpopup(driver);
	
  }
}
