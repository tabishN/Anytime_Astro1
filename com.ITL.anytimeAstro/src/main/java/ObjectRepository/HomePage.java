package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class=\"btn dropdown-toggle p-0\"]")
	private WebElement profilemenudropdown;
	
	@FindBy(xpath="//a[@onclick=\"funlogout()\"]")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//a[@class=\"btn btn-chat\" and text()=' Chat With Astrologer']")
	private WebElement chatbutton;
	
	@FindBy(id="callPg")
	private WebElement callbutton;
	
	@FindBy(xpath="//span[@class=\"mr-2 accSet accSettingWeb\"]")
	private WebElement myaccountupdate;
	
	@FindBy(xpath="//span[@class=\"gWalletbalance color-red bg-pink\"]")
	private WebElement walletbutton;

	
	public WebElement getChatbutton() {
		return chatbutton;
	}

	public WebElement getCallbutton() {
		return callbutton;
	}

	public WebElement getMyaccountupdate() {
		return myaccountupdate;
	}

	public WebElement getWallet() {
		return walletbutton;
	}

	public WebElement getProfilemenuDropdown() {
		return profilemenudropdown;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	
	public void chat(WebDriver driver) {
		waitForPageToLoad(driver);
		waitForElementToBeClickable(chatbutton, driver);
		chatbutton.click();
	}
	public void call() {
		callbutton.click();
	}
	public void accountupdate() {
		myaccountupdate.click();
	}
	public void wallet() {
		walletbutton.click();
	}
	public void menuDropDown(WebDriver driver) throws Throwable {
		waitForElementToBeVisible(driver, profilemenudropdown);
		profilemenudropdown.click();
	}
	public void logoutButton() {
		logoutbtn.click();
	}
	

}
