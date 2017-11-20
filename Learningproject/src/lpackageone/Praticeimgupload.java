package lpackageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Praticeimgupload {
	WebDriver driver;
  @Test
  public void f() throws Throwable {
	  
	  
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
		  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("8970357154");
		  driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='woffice_cover_upload']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Happy\\Desktop\\practiceimgupload.exe");
  }
}
