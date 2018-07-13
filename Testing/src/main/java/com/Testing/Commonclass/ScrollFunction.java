package com.Testing.Commonclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollFunction
{
	WebDriver driver;
	public void Scrolldown()
	{
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
			
	}
	
	public void ScrollUp()
	{
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
			
	}

}
