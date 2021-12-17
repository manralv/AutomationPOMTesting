package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.Guru99HomePage;
import pageObjects.Guru99LoginPageWithPageFactory;

public class BaseTestClass {

	public static WebDriver driver;
	public static Guru99LoginPageWithPageFactory objLogin;
	public static Guru99HomePage objHomePage;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void setupApplication() {
		Reporter.log("=====Browser Session Started=====", true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO-G50-70\\Automation-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		// driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		Reporter.log("-----> Application Started <-----", true);

		objLogin = PageFactory.initElements(driver, Guru99LoginPageWithPageFactory.class);
		objHomePage = PageFactory.initElements(driver, Guru99HomePage.class);

		/*
		 * AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		 * 100); PageFactory.initElements(factory,
		 * Guru99LoginPageWithPageFactory.class); PageFactory.initElements(factory,
		 * Guru99HomePage.class);
		 */

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);

	}
}