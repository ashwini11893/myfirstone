package com.Testing.Commonclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	WebDriver driver;
	public void MousehoverOn(WebElement element, String clickElement)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath(clickElement)).click();
		
	}
	

}
