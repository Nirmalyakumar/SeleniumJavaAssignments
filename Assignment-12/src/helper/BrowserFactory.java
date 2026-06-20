package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver BrowserOption(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		return driver;
	}
}