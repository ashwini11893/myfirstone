package com.commonLib;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterclass {
 WebDriver driver;
 @Parameters({"username","password"})
  @Test
  
  public void TestParameters(String username, String password) 
  {
	  System.out.println(username);
System.out.println(password);
	  driver=InvokeBrowser.openBrowser("firefox");
	  driver.manage().window().maximize();
	  driver.get("http://www.store.demoqa.com/");
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@title='My Account']")).click();
	  driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/wp-login.php']")).click();
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	
  }
}
