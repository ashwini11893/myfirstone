package lpackageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebooklogin {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://pohostaging.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[contains(@href,'_facebook&scope=email')]")).click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 WebElement m=driver.findElement(By.xpath("//input[@id='email']"));
	 m.clear();
	 m.sendKeys("ashwinimedhagowda@gmail.com");
	 WebElement n=driver.findElement(By.xpath("//input[@id='pass']"));
	 n.clear();
	 n.sendKeys("9731369433");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	  
	 

}}
