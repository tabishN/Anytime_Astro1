package test;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.PropertyFileUtility;
import GenericUtils.WebDriverUtility;
import ObjectRepository.HomePage;

public class sample1 extends BaseClass{

	public PropertyFileUtility pLib = new PropertyFileUtility();
	@Test(groups="regressiontest")
	public void astroLogin() throws Throwable {
		
		//reading browser type from property file
				PropertyFileUtility pr=new PropertyFileUtility();
				pr.readDataFromPropertyFile("browser");
				Thread.sleep(4000);
				
				
				// navigate to employee management
				homepage=new HomePage(driver);
				homepage.menuDropDown();
				homepage.logoutButton();
				
				
				
				
		
	}
	
	

}
