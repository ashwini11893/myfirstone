package Newstartproject.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Testing.Baseclass.InvokeBrowser;

public class testcaseone 
{
	WebDriver driver;
	public  void testing()
	{
		InvokeBrowser.openBrowser("firefox");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

}
