package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99LoginPageWithPageFactory {
	WebDriver driver;

	// Find WebElement on Home Page
	// @FindBy(how = How.NAME, using = "uid") WebElement user99GuruName;
	@FindBy(name = "uid")
	WebElement user99GuruName;
	@FindBy(name = "password")
	WebElement password99Guru;
	@FindBy(className = "barone")
	WebElement titleText;
	@FindBy(name = "btnLogin")
	WebElement login;

	// Action on Element available on Home Page
	public void setUserName(String strUserName) {// Set user name in textbox
		user99GuruName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {// Set password in password textbox
		password99Guru.sendKeys(strPassword);
	}

	public void clickLogin() {// Click on login button
		login.click();
	}

	public String getLoginTitle() {// Get the title of Login Page
		return titleText.getText();
	}

}
