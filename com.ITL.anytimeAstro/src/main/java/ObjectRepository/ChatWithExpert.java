package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatWithExpert {

	public ChatWithExpert(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search-box")
	private WebElement searchexpertfield;
	
	@FindBy(xpath="//i[@class=\"fa fa-search\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[text()='Tabish Test']")
	private WebElement expertname;
	
	@FindBy(id="expert-list")
	private WebElement expertlist;
	
	@FindBy(xpath="//a[@class=\"btn-block btn btn-primary chatbrown  letschat align-items-center \"]")
	private WebElement chatbutton;
	
	@FindBy(id="FirstName")
	private WebElement intakeformfirstname;
	
	@FindBy(id="LastName")
	private WebElement intakeformlastname;
	
	@FindBy(xpath="//input[@class=\"form-control w-100 mobilenumber\"]")
	private WebElement intakeformcontactno;
	
	


	
	
	

	
}
