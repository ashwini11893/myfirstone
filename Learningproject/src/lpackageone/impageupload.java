package lpackageone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.commonLib.Screenshot;

public class impageupload {
	WebDriver driver;
  @Test
  public void testing1() throws Throwable 
  {
	  driver=new FirefoxDriver();
	  driver.get("https://pohostaging.com/");
	 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[contains(@href,'%3A%2F%2Fwww.googleapis.com%')]")).click();
		  Thread.sleep(5000);
		 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		  driver.findElement(By.xpath("//div[@id='identifierLink']//div[2]")).click();
		  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ashwinimedhagowda@gmail.com");
		  //here i made the change Next To next
		  driver.findElement(By.xpath("//span[text()='next']")).click();
		 Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("9731369434");
		  driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  Thread.sleep(7000);
//		  WebDriverWait wait= new WebDriverWait(driver, 10)
//		  wait.until(ExpectedConditions.el
//		  
		  driver.findElement(By.xpath("//button[@id='woffice_cover_upload']")).click();
		  Runtime.getRuntime().exec("C:\\Users\\Happy\\Desktop\\newimgtoupload.exe");
		  driver.findElement(By.xpath(""));
		  
		  
  }
  @AfterMethod
  public void tearDown(ITestResult result) throws IOException{
	  if(result.isSuccess()){
		  System.out.println("testcase got pass");
	  }else{
		  Screenshot.takeAScreenShot(driver,result.getMethod().getMethodName());
	  }
  }
  
}
