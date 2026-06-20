package com.assignment9;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_9
{
	
	@Test(dataProvider = "hollandandbarrett")
	public void test(String userName, String password) throws Exception
	{
		String url = "https://auth.hollandandbarrett.com/u/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		screenshot(driver);
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
	
	
	
	public void screenshot(WebDriver driver) throws Exception 
	{
		TakesScreenshot ts= (TakesScreenshot)driver; 
		File ss = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("./ScreenShot/hollandandbarrrrett_"+currentDateTime()+".png"));	
	}


	private String currentDateTime()
	{
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM_dd_yyyy_HH_mm_ss"));
	}


	@DataProvider(name = "hollandandbarrett")
	public Object[][] dataProvider()
	{
		Object data[][] = new Object[3][2];
		
		data[0][0] = "raghubn@gmail.com";
		data[0][1] = "raghubn";
		
		data[1][0] = "9880614548";
		data[1][1] = "raghubn@123";
		
		data[2][0] = "Wiprotechnologies";
		data[2][1] = "1234567890";
		
		
		return data;
	}
}
