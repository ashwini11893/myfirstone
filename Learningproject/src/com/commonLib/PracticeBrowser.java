package com.commonLib;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeBrowser {
	public static WebDriver driver;
	public static WebDriver browserOpen(String NameOfBrowser)
	{
		if(NameOfBrowser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(NameOfBrowser.equalsIgnoreCase("Chrome"))
		{
			File f1=new File("Driverduplicate");
			File f2=new File(f1,"chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",f2.getAbsolutePath());
			driver=new ChromeDriver();
		}
		return driver;
	}

}
