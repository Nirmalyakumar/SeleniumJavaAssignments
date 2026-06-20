package com.loginPage;

import verify.Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orangehrm.pages.LoginOrangeHrm;

import helper.BrowserFactory;

public class ExecuteLoginPage
{
	@Test
	public void validateUserExecution() throws Exception
	{
		WebDriver driver = BrowserFactory.BrowserOption("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginOrangeHrm initElements = PageFactory.initElements(driver, LoginOrangeHrm.class);
		Thread.sleep(5000);
		initElements.login_EasyCal("Admin", "admin123");
		Thread.sleep(5000);
		Verification.verify(driver);
		
		
	}
}