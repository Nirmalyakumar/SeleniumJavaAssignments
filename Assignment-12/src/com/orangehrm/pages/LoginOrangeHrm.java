package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrangeHrm {
	WebDriver driver;

	public LoginOrangeHrm(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(name = "username")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;

	public void login_EasyCal(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}
