package com.Testing.Baseclass;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeBrowser {
	
	static WebDriver driver;
	public static WebDriver openBrowser(String NameOfTheBrowser)
	{
		if(NameOfTheBrowser.equalsIgnoreCase("firefox"))
		{
			File f=new File("Drivers");
			File fs=new File(f, "geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", fs.getAbsolutePath());
			driver=new FirefoxDriver();
		}
		else
		{
			//System.setProperty("webdriver.chromedriver.exe","D:\\selenum_pgm\\Testing\\Drivers\\chromedriver.exe " );
			File f=new File("Drivers");
			File fs=new File(f, "chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", fs.getAbsolutePath());
			driver=new ChromeDriver();
		}
		return driver;
	}
}
