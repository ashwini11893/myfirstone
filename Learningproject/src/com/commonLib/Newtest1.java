package com.commonLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Newtest1 {
	WebDriver driver;
	 ExtentReports report;
	 ExtentTest test;
  @Test
  public void f() throws InterruptedException {
	  report=new ExtentReports("D://first//Learningproject//Reports//chek.html");
	  test=report.startTest("checking the advance report");
	 driver=InvokeBrowser.openBrowser("firefox");
	 test.log(LogStatus.INFO, "firefox opened");
	  driver.get("http://www.airindia.in/");
	  test.log(LogStatus.INFO, "url is enetered");
	  driver.manage().window().maximize();
	  
	  /*doing the mouse hover operation*/
	   Actions act=new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//a[@id='aMnu1']"))).perform();
	   test.log(LogStatus.INFO, "mousehover on the menu");
	   driver.findElement(By.xpath("//a[contains(.,'Book a Flight')]")).click();
	   test.log(LogStatus.INFO, "clicked on the book flight");
	   Thread.sleep(3003);
	   
	   act.moveToElement(driver.findElement(By.xpath("//a[@id='aMnu1']"))).perform();
	   driver.findElement(By.xpath("//a[text()='Redeem Miles']")).click();
	  
	   //WindowHandel.handelMultipleWindow(driver, "Welcome to Flying Returns");
	   PracticeWindowHadlebynum1.winHandles(driver, 3);
	   
	   String message=driver.findElement(By.xpath("//span[text()='Redeem FR points']")).getText();
	   System.out.println(message);
	   //WindowHandel.handelwindowByNo(driver, 1);
	   PracticeWindowHadlebynum1.winHandles(driver, 1);
	   
	 //  WindowHandel.handelMultipleWindow(driver, "AirIndia E-Commerce-Flights requirements");
	   
	  // WindowHandel.handelwindowByNo(driver, 2);
	   
	   PracticeWindowHadlebynum1.winHandles(driver, 2);
	   driver.findElement(By.id("sidepanel_terms")).click();
	   PracticeWindowHadlebynum1.winHandles(driver, 1);
	   //WindowHandel.handelwindowByNo(driver, 1);
	   
	   PracticeWindowHadlebynum1.winHandles(driver, 3);
	  // WindowHandel.handelwindowByNo(driver, 3);
	   
	 //  WindowHandel.handelMultipleWindow(driver, "Welcome to Flying Returns");kjhbtht;
	   driver.findElement(By.id("username")).sendKeys("hello");
	   
	   test.log(LogStatus.PASS, "test case gotr pass");
	   
  }
  @AfterMethod
  public void tearDown(){
	  test.assignAuthor("ashu");
	  report.endTest(test);
	  report.flush();
  }
}
