package Newstartproject.Testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Testing.Baseclass.InvokeBrowser;
import com.Testing.Commonclass.ReportClass;
import com.Testing.Commonclass.ScrollFunction;
import com.Testing.TakeSnapshot.SnapShot1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class classusgunclasses {


	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	boolean ispresent;
	boolean isAllPresent;
	int count=0;
	int brokenPage=0;
	List<WebElement> links;
	int ToatalLinks;
	Random ran;
	String studentXpathAbs="html/body/div[1]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div/div[1]/div/div/form/div/div[1]/div/p/input";
	String studentXapthRel="//table[@class='em-tickets']/tbody/tr[3]/td/div[1]/div/p/input";

	ArrayList<String> Brokenlist = new ArrayList<String>();
	@Test
	public void testcaseone() throws InterruptedException, IOException{
		//		
		//		report=ReportClass.GenerateReport();
		//		test=report.startTest("testing of ungunclasses is started");
		driver=InvokeBrowser.openBrowser("firefox");
		//		test.log(LogStatus.INFO, "Launching firefox");
		driver.get("https://usgunclasses.com/find-a-class/");
		//		test.log(LogStatus.INFO,"Test url is entered in the browser");


		links =driver.findElements(By.xpath("//div[@class='vc_column-inner vc_custom_1434415695897']//a"));
		ToatalLinks=links.size();
		System.out.println("Total links of subsites available are "+ ToatalLinks);


		if(isAllELementPresnt("//div[@class='vc_column-inner vc_custom_1434415695897']//a")==true){
			while(count<ToatalLinks){
				try{
					List<WebElement> links1 =driver.findElements(By.xpath("//div[@class='vc_column-inner vc_custom_1434415695897']//a"));
					WebDriverWait  wait1=new WebDriverWait(driver, 10);
					wait1.until(ExpectedConditions.elementToBeClickable(links1.get(count)));
					links1.get(count).click();
					Thread.sleep(1000);
					if(isELementPresnt("//div[@id='em-booking']")==true){
						//Thread.sleep(2000);
						/***
						 *1. Here need tom write the code to genearte 
						 * random value
						 * 2.Call the rigistration function
						 * 
						 * 3Pass all the random as argumnet 
						 * to the registration function
						 * 
						 * **/
						ran=new Random();
						int randomnum1=ran.nextInt(100);
						int randomnum2=ran.nextInt(1000000);

						String studentName= "ashwini"+randomnum1;
						System.out.println("The  name is "+studentName);
						String fullName= "gowda"+randomnum1;
						System.out.println("The first name is "+fullName);
						String email= "ashwini@gmail.com"+randomnum1;
						System.out.println("the email is "+email);
						int pinCode=randomnum2;
						System.out.println("The pin is "+pinCode);


						//								Filling the registration form

						fillResgistration(studentName,fullName,email,pinCode);
						driver.navigate().back();
						Thread.sleep(1000);
						if(isELementPresnt("//div[@id='em-booking']")==true){
							driver.navigate().back();
						}


					}
				}
				catch(Throwable t){
					t.printStackTrace();
					String title=driver.getTitle();
					String url=driver.getCurrentUrl();
					System.out.println("The titlle of the borken page is "+title);
					System.out.println("the url of the broken page is " +url);
					Brokenlist.add(url);
					String methodName="usgunclassSnapShot"+ran.nextInt(1000);
					SnapShot1.SnapshotTake(driver,methodName);
					brokenPage++;
					driver.navigate().back();
					count++;
					continue;
				}

				count++;
				
			}

		}else{
			System.out.println("elements are not visible");
		}

		System.out.println("the total no of broken page is: "+brokenPage);
		System.out.println(Brokenlist);
	}





	public boolean isELementPresnt(String xpath){



		try{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			List<WebElement> element=driver.findElements(By.xpath(xpath));
			if(element.size()!=0){
				ispresent=true;
			}
			else{
				ispresent=false;
			}

		}catch(Throwable t){
			t.printStackTrace();
		}
		//return ispresent;
		return ispresent;

	}

	public boolean isAllELementPresnt(String xpath){



		WebDriverWait  wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));

		try{
			List<WebElement> element=driver.findElements(By.xpath(xpath));
			if(element.size()!=0){
				isAllPresent=true;
			}
			else{
				isAllPresent=false;
			}

		}catch(Throwable t){

		}
		return isAllPresent;

	}


	public void fillResgistration(String StudentName, String FullName, String Email,int randomnum2) throws InterruptedException{

//		System.out.println("the status of stdent name in rel "+ isELementPresnt(studentXapthRel)+" and for the absolute is "+isELementPresnt(studentXpathAbs));
		
		while(true){

			if(isELementPresnt(studentXapthRel)==true){

				driver.findElement(By.xpath(studentXapthRel)).sendKeys(StudentName);
				break;
			}else{
				driver.findElement(By.xpath(studentXpathAbs)).sendKeys(StudentName);
				break;
			}

		}




		//		Thread.sleep(500);
		//		JavascriptExecutor jse= (JavascriptExecutor) driver;
		//		jse.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(FullName);

		driver.findElement(By.xpath("//input[@name='user_email']")).sendKeys(Email);

		driver.findElement(By.xpath("//input[@name='dbem_zip']")).sendKeys(""+randomnum2);

		driver.findElement(By.xpath("//input[@id='em-booking-submit']")).click();
		 
		if(isELementPresnt("//p[@class='paypal-logo paypal-logo-long']")==true)
		{
			System.out.println("Its redfirecting to the pay pal page");
			
		}else{
			System.out.println("pay pal  is not showing ");
		}
		
	}
}

