package lpackageone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.commonLib.Practicesnapshot;

public class Againsnapshot {
	static WebDriver driver;
	@Test
	public void fuction1() throws InterruptedException {
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

	}
	@AfterMethod
	public static void finishing(ITestResult result) throws IOException
	{
		if(result.isSuccess()){
			System.out.println("test is passed");
		}
		else
		{
			Practicesnapshot.takePicture(driver,result.getMethod().getMethodName());
		}

	}
}
