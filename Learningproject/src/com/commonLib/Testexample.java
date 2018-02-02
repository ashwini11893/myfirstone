package com.commonLib;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Testexample 
{
	WebDriver driver;
  @Test
  public void f() {
	  driver=new FirefoxDriver();
	  driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  JavaScriptExecutor jse= (JavaScriptExecutor) driver;
	  jse.
	  //driver.findElement(By.xpath("//button[@id='alert']")).click();
	  FluentWait wait= new FluentWait(driver);
	  wait.withTimeout(30,TimeUnit.SECONDS);
	  wait.pollingEvery(10, TimeUnit.MILLISECONDS);
	  wait.ignoring(NoSuchElementException.class);
	  wait.until(ExpectedConditions.alertIsPresent());
	  driver.findElement(By.xpath("//button[@id='alert']")).click();
  }
  }
