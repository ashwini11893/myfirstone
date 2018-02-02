package com.Testing.Commonclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertHandle {
	WebDriver driver;
	public void handleAlert()
	{
		Alert alr=driver.switchTo().alert();
		alr.accept();
		alr.dismiss();
		String alertcontent=alr.getText();
		System.out.println("Alert message is "+alertcontent);
		//alr.sendKeys(SendText);
		
	}

}
