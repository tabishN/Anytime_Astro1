package ObjectRepository;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.WebDriverUtility;

public class ChatWithExpert  extends WebDriverUtility{
	public String Male;
	public String Married;
	public WebDriver driver;

	public ChatWithExpert(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search-box")
	private WebElement searchexpertfield;
	
	@FindBy(xpath="//button[@class=\"btn btn-link search-btn\" and @type=\"button\"]")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[text()='Astro tabish']")
	private WebElement expertname;
	
	@FindBy(id="expert-list")
	private WebElement expertlist;
	
	@FindBy(id="psychic-20325-chat-btn")
	private WebElement chatbutton;
	
	@FindBy(id="FirstName")
	private WebElement intakeformfirstname;
	
	@FindBy(id="LastName")
	private WebElement intakeformlastname;
	
	@FindBy(xpath="//input[@class=\"form-control w-100 mobilenumber\"]")
	private WebElement intakeformcontactno;
	
	@FindBy(id="date-picker-example")
	private WebElement intakedobfield;
	
	@FindBy(xpath="(//div[@class=\"picker__day picker__day--infocus\" and text()='7'])[3]")
	private WebElement intakedob;
	
	@FindBy(id="TOB")
	private WebElement intaketobfield;
	
	@FindBy(xpath="//div[@class=\"clockpicker-tick\" and text()='12']")
	private WebElement intaketobhour;
	
	@FindBy(xpath="//div[@class=\"clockpicker-tick\" and text()='05']")
	private WebElement intaketobmin;
	
	@FindBy(xpath="//button[@class=\"btn btn-flat clockpicker-button done-button\" and text()='OK']")
	private WebElement intaketobokbtn;
	
	@FindBy(id="pdbc")
	private WebElement intakeplaceofbirth;
	
	@FindBy(xpath="//li[@class=\"ui-menu-item\" and @id=\"ui-id-86\"]")
	private WebElement intakeplaceofbirthaddress;
	
	@FindBy(id="GenderId")
	private WebElement intakegender;
	
	@FindBy(id="MaritalStatus")
	private WebElement intakemaritalStatus;
	
	@FindBy(id="IsPartner")
	private WebElement intakepartnerDetailstick;
	
	@FindBy(id="FirstNamePartner")
	private WebElement intakepartnerfirstname;
	
	@FindBy(id="LastNamePartner")
	private WebElement intakepartnerlastname;
	
	@FindBy(id="date-picker-example")
	private WebElement intakepartnerdobfield;
	
	@FindBy(xpath="(//div[@class=\"picker__day picker__day--infocus picker__day--today picker__day--highlighted\" and text()='14'])[5]")
	private WebElement intakepartnerdob;
	
	@FindBy(id="TOBPartner")
	private WebElement intakepartnertob;
	
	@FindBy(xpath="(//div[@class=\"clockpicker-tick\" and text()='12'])[2]")
	private WebElement intakepartnertobhour;
	
	@FindBy(xpath="(//div[@class=\"clockpicker-tick\" and text()='10'])[4]")
	private WebElement intakepartnertobmin;
	
	@FindBy(xpath="(//button[@class=\"btn btn-flat clockpicker-button done-button\" and text()='OK'])[2]")
	private WebElement intakepartnertobokBtn;
	
	@FindBy(id="POBPartner")
	private WebElement intakepartnerpobfield;
	
	@FindBy(xpath="//li[@class=\"ui-menu-item\" and @id=\"ui-id-41\"]")
	private WebElement intakepartnerpobaddress;
	
	@FindBy(id="GenderIdPartner")
	private WebElement intakepartnerGender;
	
	@FindBy(xpath="//button[text()='Start Chat with Astro tabish']")
	private WebElement intakestartchatwithAstroTabish;
	
	@FindBy(xpath="//h3[text()='Astro tabish']")
	private WebElement expertNameDuringChatWaiting;
	
	@FindBy(xpath="//textarea[@placeholder=\"Type your message here ...\"]")
	private WebElement sendmessagetoExpert;
	
	@FindBy(xpath="//button[@class=\"btn btn-primary firechat\" and text()='Send']")
	private WebElement sendMessageBtn;
	
	@FindBy(xpath="//a[text()='End Chat']")
	private WebElement endChatWithExpert;
	
	@FindBy(xpath="//h4[text()='Chat Summary']")
	private WebElement chatSummary;
	
	@FindBy(xpath="//button[@class=\"btn btn-default border-outline mr-1 closebtn\" and text()='No']")
	private WebElement endchatNObtn;
	
	@FindBy(id="paidTimeCounter")
	private WebElement paidTimer;



	
	public WebElement getPaidTimer() {
		return paidTimer;
	}
	public WebElement getEndchatNObtn() {
		return endchatNObtn;
	}
	public WebElement getChatSummary() {
		return chatSummary;
	}
	public WebElement getEndChatWithExpert() {
		return endChatWithExpert;
	}
	public WebElement getSendMessageBtn() {
		return sendMessageBtn;
	}
	public WebElement getSendmessagetoExpert() {
		return sendmessagetoExpert;
	}
	public WebElement getSearchexpertfield() {
		return searchexpertfield;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getExpertname() {
		return expertname;
	}
	public WebElement getExpertlist() {
		return expertlist;
	}
	public WebElement getChatbutton() {
		return chatbutton;
	}
	public WebElement getIntakeformfirstname() {
		return intakeformfirstname;
	}
	public WebElement getIntakeformlastname() {
		return intakeformlastname;
	}
	public WebElement getIntakeformcontactno() {
		return intakeformcontactno;
	}
	public WebElement getIntakedobfield() {
		return intakedobfield;
	}
	public WebElement getIntakedob() {
		return intakedob;
	}
	public WebElement getIntaketobfield() {
		return intaketobfield;
	}
	public WebElement getIntaketobhour() {
		return intaketobhour;
	}
	public WebElement getIntaketobmin() {
		return intaketobmin;
	}
	public WebElement getIntaketobokbtn() {
		return intaketobokbtn;
	}
	public WebElement getIntakeplaceofbirth() {
		return intakeplaceofbirth;
	}
	public WebElement getIntakeplaceofbirthaddress() {
		return intakeplaceofbirthaddress;
	}
	public WebElement getIntakegender() {
		return intakegender;
	}
	public WebElement getIntakemaritalStatus() {
		return intakemaritalStatus;
	}
	public WebElement getIntakepartnerDetailstick() {
		return intakepartnerDetailstick;
	}
	public WebElement getIntakepartnerfirstname() {
		return intakepartnerfirstname;
	}
	public WebElement getIntakepartnerlastname() {
		return intakepartnerlastname;
	}
	public WebElement getIntakepartnerdobfield() {
		return intakepartnerdobfield;
	}
	public WebElement getIntakepartnerdob() {
		return intakepartnerdob;
	}
	public WebElement getIntakepartnertob() {
		return intakepartnertob;
	}
	public WebElement getIntakepartnertobhour() {
		return intakepartnertobhour;
	}
	public WebElement getIntakepartnertobmin() {
		return intakepartnertobmin;
	}
	public WebElement getIntakepartnertobokBtn() {
		return intakepartnertobokBtn;
	}
	public WebElement getIntakepartnerpobfield() {
		return intakepartnerpobfield;
	}
	public WebElement getIntakepartnerpobaddress() {
		return intakepartnerpobaddress;
	}
	public WebElement getIntakepartnerGender() {
		return intakepartnerGender;
	}
	public WebElement getIntakestartchatwithTabishTest() {
		return intakestartchatwithAstroTabish;
	}
	
	
	public void searchExpert() throws Throwable {
		searchexpertfield.sendKeys("tabish");
		searchbutton.click();
		Thread.sleep(2000);
		chatbutton.click();
		
	}
	public void passCustomerDetails() throws Throwable {
		/*
		intakeformfirstname.sendKeys("test first");
		intakeformlastname.sendKeys("last");
		intakeformcontactno.sendKeys("9983662400");
		intakedobfield.click();
		intakedob.click();
		intaketobfield.click();
		intaketobhour.click();
		intaketobmin.click();
		intaketobokbtn.click();
		intakeplaceofbirth.sendKeys("kota");
		intakeplaceofbirthaddress.click();
		intakegender.click();
		
		select(intakegender, Male);
		intakemaritalStatus.click();
		
		select(intakemaritalStatus, Married); 
		*/
		intakestartchatwithAstroTabish.click();
		String pt=paidTimer.getText();
		System.out.println(pt);
		
		
		sendmessagetoExpert.sendKeys("hello");
		
		//mouseClick(driver, sendMessageBtn);
		
		endChatWithExpert.click();
		endchatNObtn.click();
		sendMessageBtn.click();
		System.out.println(chatSummary.getText());
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	


	
	
	

	
}
