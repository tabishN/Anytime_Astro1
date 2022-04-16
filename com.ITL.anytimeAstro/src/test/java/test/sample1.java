package test;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.PropertyFileUtility;
import GenericUtils.WebDriverUtility;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

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
				Thread.sleep(2000);
				homepage.logoutButton();
				System.out.println("ok............done");
				
		
				
				
				
		
	}
	
	

}
