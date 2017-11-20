package lpackageone;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class googlelogin1 {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  FirefoxProfile fp=new FirefoxProfile();

	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	 // System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	 // driver= new ChromeDriver();
	  driver=new FirefoxDriver(fp);
	  
	  driver.get("https://pohostaging.com/");
	 // driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(@href,'%3A%2F%2Fwww.googleapis.com%')]")).click();
	  Thread.sleep(5000);
	 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  driver.findElement(By.xpath("//div[@id='identifierLink']//div[2]")).click();
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ashwinimedhagowda@gmail.com");
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	 Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("8970357154");
	  driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[text()='Marketplace']"))).perform();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[text()='Upgrade Subscription']")).click();
	  
	  act.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();
	  
	  
	  
	  //driver.findElement(By.xpath("//a[@id='user-login']")).click();
	
	  
  }
}
