package com.commonLib;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Testdataprovider {
	WebDriver driver;
	@DataProvider
	  public Object[][] testing() 
	  {
	   
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	 
	      
	    }
	  
  @Test(dataProvider = "testing")
  public void f(String username,String password) 
  {
	  driver=InvokeBrowser.openBrowser("firefox");
	  driver.manage().window().maximize();
	  driver.get("http://www.store.demoqa.com/");
	  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@title='My Account']")).click();
	  driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/wp-login.php']")).click();
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	  driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
      driver.quit();
	  
  }

//  @DataProvider
//  public Object[][] testing() 
//  {
//    return new Object[][] {
//    	
//      new Object[] [] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }}
//      
//    };
//  }
}
