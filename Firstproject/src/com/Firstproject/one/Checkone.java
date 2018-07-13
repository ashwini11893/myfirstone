package com.Firstproject.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkone {
  @Test
  public void f() throws InterruptedException, FileNotFoundException {
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://app.pohostaging.com/");
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
	  Actions act= new Actions(driver);
	  WebElement up =driver.findElement(By.xpath("//a[text()='Marketplace']"));
	  act.moveToElement(up).perform();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[contains(text(),'Upgrade')]")).click();
	  Thread.sleep(800);
	  driver.findElement(By.xpath("//h2[text()='PowerSite Upgrade: Silver']")).click();
	  WebElement m= driver.findElement(By.xpath("//select[@name='woo_field_site']"));
	  org.openqa.selenium.support.ui.Select sel= new org.openqa.selenium.support.ui.Select(m);
	  sel.selectByVisibleText("check.pohostaging.com");
//	  driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
//	  Thread.sleep(800);
//	  driver.findElement(By.xpath("//a[text()='View cart']")).click();
//	  JavascriptExecutor jse = (JavascriptExecutor)driver;
//	  jse.executeScript("window.scrollBy(0,250)", "");
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,300)", "");
	  driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
	  driver.findElement(By.xpath("//a[text()='View cart']")).click();
	  Thread.sleep(500);
	  WebElement n =driver.findElement(By.xpath("//input[@inputmode='numeric']"));
	  n.clear();
	  n.sendKeys("3");
	  js.executeScript("window.scrollBy(0,150)", "");
	  //driver.findElement(By.xpath("//input[@name='update_cart']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
	  js.executeScript("window.scrollBy(0,1650)", "");
//	 
//	  try {
//		  driver.findElement(By.xpath("//li[input[@id='payment_method_bacs']]")).click();
//	} catch (Exception e) {
//		System.out.println("wt to do");
//		// TODO: handle exception
//	}
  WebElement o= driver.findElement(By.xpath("//li[input[@id='payment_method_bacs']]"));
  int xloc=o.getLocation().x;
  int yloc=o.getLocation().y;
  act.moveByOffset(xloc, yloc).click().perform();
//	  WebDriverWait wait= new WebDriverWait(driver, 1000);
//	  wait.until(ExpectedConditions.elementToBeClickable(o));
	  //driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='place_order']")).click();
	  FileInputStream fis= new FileInputStream("C:\\Users\\Happy\\Desktop");
	
	 
	 
	  
	  
	  
	  
 
	  
	  
	  
	  
	 
	  
	 
	  
	 
	  
	  
  }
	  
}
