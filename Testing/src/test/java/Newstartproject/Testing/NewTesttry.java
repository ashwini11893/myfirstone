package Newstartproject.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Testing.Baseclass.InvokeBrowser;

public class NewTesttry {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver=InvokeBrowser.openBrowser("firefox");
	  driver.get("https://app.pohostaging.com/");
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='user']")).sendKeys("tester");
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("reset123");
	  driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
  }
}
