	package com.assignment2;
	
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	public class EasyCalculation
	{
		WebDriver driver;
		String url = "https://www.easycalculation.com/";
		
		@BeforeTest
		public void setUp()
		{
			driver = new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
		}
		
		@Test
		public void test() throws Exception
		{
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='//www.easycalculation.com/date-day/age-calculator.php']")).click();
			
			Thread.sleep(5000);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			List<WebElement> images = driver.findElements(By.tagName("img"));
			
			System.out.println("Number of Links : " + links.size());
			System.out.println("Number of Images : " + images.size());
			
			for(int i=0;i<Math.min(10, links.size());i++)		
			{
				String url = links.get(i).getAttribute("href");
				System.out.println(url);
			}
			
			for(int i=0;i<Math.min(5, links.size());i++)
			{
				String imag = images.get(i).getAttribute("src");
				System.out.println(imag);
			}
			
			driver.findElement(By.xpath("//input[@id='i21']")).sendKeys("15");
			driver.findElement(By.xpath("//input[@id='i22']")).sendKeys("08");
			driver.findElement(By.xpath("//input[@id='i23']")).sendKeys("1947");
			
			driver.findElement(By.xpath("//input[@name='but']")).click();
			
			Thread.sleep(5000);
			
			String age = driver.findElement(By.xpath("//input[@id='r1']")).getAttribute("value");
			String days = driver.findElement(By.xpath("//input[@id='r4']")).getAttribute("value");
			String hour = driver.findElement(By.xpath("//input[@id='r3']")).getAttribute("value");
			String minute  = driver.findElement(By.xpath("//input[@id='r2']")).getAttribute("value");
			
			System.out.println("Your age is : " + age);
			System.out.println("Age in Days : " + days);
			System.out.println("Age in Hours : " + hour);
			System.out.println("Age in Minutes : " + minute);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@onclick='clearall()']")).click();
		}
		
		@AfterTest
		public void tearDown()
		{
			if(driver != null)
			driver.quit();
		}
		
	}
