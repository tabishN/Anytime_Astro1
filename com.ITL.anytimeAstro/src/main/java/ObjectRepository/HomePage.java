package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="dropdownMenuLink")
	private WebElement profilemenudropdown;
	
	@FindBy(xpath="//a[@onclick=\"funlogout()\"]")
	private WebElement logoutbtn;

	public WebElement getProfilemenuDropdown() {
		return profilemenudropdown;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	public void menuDropDown() {
		profilemenudropdown.click();
	}
	public void logoutButton() {
		logoutbtn.click();
	}

}
