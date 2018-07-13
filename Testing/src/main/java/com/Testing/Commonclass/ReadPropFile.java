package com.Testing.Commonclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	
	
	{
		Properties prop= new Properties();
		FileInputStream fip= new FileInputStream("D:\\first\\Testing\\src\\main\\java\\com\\Testing\\Commonclass\\config.properties");
		prop.load(fip);
		String name=prop.getProperty("name");
		String browserName=prop.getProperty("browser");
		System.out.println(name);
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\first\\Testing\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browserName.equals("FF")) 
		{
			System.setProperty("WebDriver.gecko.driver","D:\\first\\Testing\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		
		}
		driver.get(prop.getProperty("url"));
	}

}
