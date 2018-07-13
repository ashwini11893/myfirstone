package Newstartproject.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Testing.Baseclass.InvokeBrowser;
import com.Testing.Commonclass.WindowHandleByNum;

public class Testone {
	WebDriver driver;
	@BeforeClass
	public void beforetest()
	{
		driver=InvokeBrowser.openBrowser("firefox");
		//driver.manage().window().maximize();
	}
  @Test
  public void Testmethodone() 
  {
	  
	  driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		
  }
}
