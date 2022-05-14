package test;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.PropertyFileUtility;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class LoginWithEmail extends BaseClass{

	public LoginPage loginpage;

	public PropertyFileUtility pLib = new PropertyFileUtility();
	@Test(groups="regressiontest")
	public void astroEmailLogin() throws Throwable {
		String USERNAME = pLib.readDataFromPropertyFile("username");
		//logger.info("Entered username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");
		//logger.info("Entered password");
		
	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginEmail(driver);
		loginpage.login(USERNAME, PASSWORD);
									
	}
	public void chatButton() {
		HomePage homepage = new HomePage(driver);
		homepage.chat();
		
	}
	

}
