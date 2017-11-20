package lpackageone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class downloadfile {
	WebDriver driver;

	@Test
	public void f() {
		//	  ***************** to launch the code in Chrome********************
		//	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Happy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//	 WebDriver driver=new ChromeDriver();
		//	 driver.get("https://www.flipkart.com/");
		//	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		//	  ************************ to download file***************

		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("Browser.download.folderList", 0);
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//a[@href='http://selenium-release.storage.googleapis.com/3.5/selenium-java-3.5.3.zip']")).click();



	}
}
