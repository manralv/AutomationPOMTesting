package testCases;

import org.testng.annotations.Test;

public class TestGuru99Login_Positive extends BaseTestClass {
	@Test(description = "This TC will perform valid login")
	public void enterUserName() throws Throwable {
		objLogin.setUserName("mngr373874");
	}

	@Test(dependsOnMethods = "enterUserName")
	public void enterPassword() throws Throwable {
		objLogin.setPassword("qEvAdYb");
	}

	@Test(dependsOnMethods = "enterPassword")
	public void clickLoginButton() throws Throwable {
		objLogin.clickLogin();
	}

	@Test(dependsOnMethods = "clickLoginButton")
	public void fetchPageTitle() throws Throwable {
		System.out.println("Page Title > '" + objLogin.getLoginTitle()+ "'");
		Thread.sleep(5000);
	}
	
	@Test(dependsOnMethods = "fetchPageTitle")
	public void checkLoggedUser() throws Throwable {
		System.out.println("User logged in as - '" + objHomePage.getUserName()+ "'");
		Thread.sleep(5000);
	}
}