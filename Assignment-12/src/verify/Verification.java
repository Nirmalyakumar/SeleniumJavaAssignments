package verify;

import org.openqa.selenium.WebDriver;

public class Verification
{
	public static void verify(WebDriver driver)
	{
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		if(currentURL.equals(expectedURL))
		{
			System.out.println("Code is working perfected");
		}
		else
		{
			System.out.println("Code is not working as expected");
		}
	}
}
