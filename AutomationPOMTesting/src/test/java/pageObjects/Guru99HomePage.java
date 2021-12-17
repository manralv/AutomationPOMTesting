package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Guru99HomePage {

	WebDriver driver;

	// Fine Element on Home Page
	@FindBy(xpath = "//tr[@class='heading3']/td")
	WebElement UserName;

	// Action on Element on Home Page
	public String getUserName() {// Get user name from home page
		String fun = null;
		fun = UserName.getText().trim();
		int i = fun.indexOf(":");
		return fun.substring(i + 1, fun.length()).trim();
	}

}
