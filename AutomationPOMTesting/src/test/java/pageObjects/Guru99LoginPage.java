package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99LoginPage {
	WebDriver driver;
	
	public Guru99LoginPage(WebDriver driver) {
		this.driver = driver;	}
	
	// Find Element on Home Page
	By user99GuruName = By.name("uid");
	By password99Guru = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");

	
	//Action on Element available on Home Page
	public void setUserName(String strUserName) {// Set user name in textbox
		driver.findElement(user99GuruName).sendKeys(strUserName);	}
	
	public void setPassword(String strPassword) {// Set password in password textbox
		driver.findElement(password99Guru).sendKeys(strPassword);	}
	
	public void clickLogin() {// Click on login button
		driver.findElement(login).click();	}
	
	public String getLoginTitle() {// Get the title of Login Page
		return driver.findElement(titleText).getText();	}
	
	
	
	public void loginToGuru99(String strUserName,String strPasword){
        this.setUserName(strUserName);//Fill user name
        this.setPassword(strPasword);//Fill password
        this.clickLogin();//Click Login button    
    }
	
	
	
	
	
}
