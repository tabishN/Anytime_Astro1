package test;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.PropertyFileUtility;
import ObjectRepository.LoginPage;

public class LoginWithOTP extends BaseClass {
	public LoginPage loginpage;

	public PropertyFileUtility pLib = new PropertyFileUtility();
	@Test(groups="regressiontest")
	public void astroOTPLogin() throws Throwable {

		String MOBILENUMBER = pLib.readDataFromPropertyFile("mobilenumber");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginWithOtp(MOBILENUMBER);

	}

}
