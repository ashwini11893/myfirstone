package lpackageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class windowh {
  @Test
  public void f() {
	  WebDriver driver;
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://timesofindia.indiatimes.com/");
	  driver.findElement(By.xpath(""));
  }
}
