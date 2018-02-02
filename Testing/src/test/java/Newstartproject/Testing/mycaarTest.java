package Newstartproject.Testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



import com.Testing.Baseclass.InvokeBrowser;
import com.Testing.Commonclass.ReportClass;
import com.Testing.TakeSnapshot.SnapShot1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class mycaarTest 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@Test
	public void firsttestcase() {
		report=ReportClass.GenerateReport(report);
		test=report.startTest("Testing will start here");
		driver=InvokeBrowser.openBrowser("firefox");
		test.log(LogStatus.INFO, "Launching firefox");
		driver.get("http://mycaarstaging.com/lms/site/login");
		test.log(LogStatus.INFO, "Opening the test url");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximamizing the window");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("8nif3lmnjtvas9@my10minutemail.com1");
		test.log(LogStatus.INFO, "Entered the username");
		test.log(LogStatus.INFO, "Entered the psw");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("reset123");
		test.log(LogStatus.INFO, "Clicked on the submit button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Click on the program dail in home page");
		driver.findElement(By.xpath("//a[@href='/lms/site/user-program?id=45'][div[span[contains(.,'0%')]]]")).click();
		//************
		test.log(LogStatus.INFO, "Click on the capability test button");
		driver.findElement(By.xpath(".//*[@id='content']/section/div/div/div[4]/div/div/div[2]/ul/li/div[2]/div/div/div[2]/div/a/span/center")).click();
		test.log(LogStatus.INFO, "Get the text from the popup.");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""
				+ "//div[@id='myModal4'][div[div[div[div[p[contains(text(),'You are not able to complete your own capabilty test.')]]]]]]"))));

		String text=driver.findElement(By.xpath(""
				+ "//div[@id='myModal4'][div[div[div[div[p[contains(text(),'You are not able to complete your own capabilty test.')]]]]]]")).getText();
		System.out.println(text);
		test.log(LogStatus.INFO, "Click on the close button in popup");
		driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();

	}
	@AfterMethod
	public void verify(ITestResult res) throws IOException
	{
		if(res.isSuccess())
		{
			test.log(LogStatus.PASS, "Testcase passed");
		}
		else{
			String imagepath=SnapShot1.SnapshotTake(driver,res.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(imagepath));
		}
	}

@AfterClass
public void finishit()
                 {
	driver.quit();
	test.assignAuthor("ashwinigowda");
	report.endTest(test);
	report.flush();
   }
}
