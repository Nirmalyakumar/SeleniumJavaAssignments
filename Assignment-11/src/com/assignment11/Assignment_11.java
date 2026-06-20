package com.assignment11;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_11
{
	@Test
	public void test() throws Exception
	{
		String url = "https://auth.hollandandbarrett.com/u/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bappi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bappi");
		screenshot(driver);
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(5000);
		
//		Click Reward
		
		 WebElement element = driver.findElement(By.xpath("(//div[@aria-label='BAPPI'])[1]"));
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		 
		 driver.findElement(By.xpath("(//a[normalize-space()='H&B&Me Rewards']")).click();
		 
		 Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.hollandandbarrett.com/my-account/rfl";
		
		if(!currentUrl.equals(expectedUrl))
		{
			screenshot(driver);
		}
		
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
}





