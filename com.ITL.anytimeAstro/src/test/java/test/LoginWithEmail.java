package test;

import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.PropertyFileUtility;
import ObjectRepository.ChatWithExpert;
import ObjectRepository.HomePage;

public class LoginWithEmail extends BaseClass{
	public PropertyFileUtility pLib = new PropertyFileUtility();
	
	
	@Test(groups="regressiontest")
	public void chatButton() throws Throwable {
		System.out.println("Chat Button Selected");
		HomePage homepage = new HomePage(driver);
		Thread.sleep(3000);
		homepage.chat(driver);
		ChatWithExpert expertchat=new ChatWithExpert(driver);
		
		
		expertchat.searchExpert();
		expertchat.passCustomerDetails();
		
	}
	

}
