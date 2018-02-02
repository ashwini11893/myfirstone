package com.Testing.Commonclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class DownloadFile {
	static WebDriver driver;
	public static void Download(String xpathofEle)
	{


		FirefoxProfile pro= new FirefoxProfile();
		pro.setPreference("browser.download.folderList", "0");
		pro.setPreference("browser.helperApps.neverAsk.saveToDisk", "application.zip");
		driver=new FirefoxDriver(pro);
		driver.findElement(By.xpath(xpathofEle)).click();
		
	}

	public static void Downloadtospecificfolder(String xpathofEle)
	{


		FirefoxProfile pro=new FirefoxProfile();
		pro.setPreference("browser.download.folderList","2");
		pro.setPreference("browser.download.dir","D:\\selenum_pgm");
		pro.setPreference("browser.helperApps.neverAsk.saveToDisk", "application.zip");
		driver=new FirefoxDriver(pro);
		driver.findElement(By.xpath(xpathofEle)).click();
	}

}
