package com.Testing.Commonclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScrollFunction
{
	static WebDriver driver;
	@Test
	public static void Scrolldown()
	{
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
			
	}
	@Test
	public static void ScrollUp()
	{
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
			
	}

}
