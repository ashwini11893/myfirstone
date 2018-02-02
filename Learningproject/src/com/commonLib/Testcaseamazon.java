package com.commonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcaseamazon {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//img[contains(@src,'https://images-eu.ssl-images-amazon.com/images/I/51gu3yvo%2BoL._AC_SY200_.jpg')]")).click();
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath(" //div[div[h2[span[contains(text(),'Related to items you')]]]] //img[contains(@src,'https://images-eu.ssl-images-amazon.com/images/I/511F9ED-D8L._AC_SY200_.jpg')]")).click();
  
	  
	  
  }
}
