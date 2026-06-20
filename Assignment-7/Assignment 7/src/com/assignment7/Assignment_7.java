package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_7
{
	WebDriver driver;
	String url = "https://www.spicejet.com/";
	
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@data-focusvisible-polyfill='true']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Departure Date']")).click();
		
//		Scroll
		((JavascriptExecutor) driver).executeScript("scroll(0,200)");
		
		
		Thread.sleep(5000);
		

		
		
//		driver.findElement(By.xpath("//div[contains(text(),'Tue, 30 Jun 2026')]")).click();
//		Thread.sleep(5000);
		
//		Select 5 Adult
		
//		for(int i=0;i<4;i++)
//		{
//			driver.findElement(By.xpath("//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']")).click();
//		}
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		
		
		
		
	}
	
	
}
