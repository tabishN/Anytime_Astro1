package GenericUtils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public WebDriverUtility wLib = new WebDriverUtility();
	public PropertyFileUtility pLib = new PropertyFileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public HomePage homepage;
	public LoginPage loginpage;
	public static WebDriver sdriver;
	public static Logger logger;
	 
	
	
	@BeforeSuite(groups = {"smokeTest","regressionTest"})
	public void configBS() 
	{
		System.out.println("Connect to DataBase");
	}
	
	//@Parameters("browser")
	@BeforeClass(groups = {"smokeTest","regressionTest"})
	public void configBC() throws Throwable
	{
		String browsername = pLib.readDataFromPropertyFile("browser");
		if(browsername.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			}
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver= new ChromeDriver();
		}
		sdriver=driver;
		driver.manage().window().maximize();
		logger = Logger.getLogger("soleFitInnovana");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void setUp() throws Throwable {
		
		String URL = pLib.readDataFromPropertyFile("url");
		//logger.info("URL is opened");
		driver.get(URL);
		
		//Login to Application
		LoginPage loginpage = new LoginPage(driver);
		loginpage.signin();
		String USERNAME = pLib.readDataFromPropertyFile("username");
		//logger.info("Entered username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");
		//logger.info("Entered password");
		
	
		
		loginpage.loginEmail(driver);
		loginpage.login(USERNAME, PASSWORD);
		
	}

	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void tearDown() throws Throwable {
		HomePage homepage =new HomePage(driver);
		homepage.menuDropDown(driver);
		homepage.logoutButton();
	}
	
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		driver.quit();
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() {
		System.out.println("Close the Connection from DataBase");
	}
	
		
		
		
		
		
	}
	
	
	
	
	

