package com.Firstproject.one;

import java.awt.Desktop.Action;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Checkone {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://pohostaging.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//	  driver.findElement(By.xpath("//a[@ href='#register-form']")).click();
//	  Thread.sleep(6000);
//	  driver.findElement(By.xpath("//*[@id='reg-name']")).sendKeys("moni4");
//	  driver.findElement(By.xpath("//input[@name='reg_email']")).sendKeys("moni14@gamail.com");
//	  driver.findElement(By.xpath("//input[@id='reg-pass']")).sendKeys("reset123");
//	  driver.findElement(By.xpath("//*[@id='reg-pass-confirmation']")).sendKeys("reset123");
//	  driver.findElement(By.xpath("//*[@name='reg_submit']")).click();
//	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//input[@id='user']")).sendKeys("jisha");
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("reset123");
	  driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//a[text()='Marketplace']"));
	  Actions act= new Actions(driver);
	  WebElement up =driver.findElement(By.xpath("//a[text()='Marketplace']"));
	  act.moveToElement(up).perform();
	  driver.findElement(By.xpath("//a[contains(text(),'Upgrade')]")).click();
	 
	  
	 
	  
	  
  }
	  
}
