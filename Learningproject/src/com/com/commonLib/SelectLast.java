package com.com.commonLib;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.commonLib.InvokeBrowser;

public class SelectLast 
{
	WebDriver driver;
  @Test
  public void LastElementSel() 
  {
	  driver=InvokeBrowser.openBrowser("firefox");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  WebElement ele=driver.findElement(By.xpath("//select[@id='year']"));
	  Select sel=new Select(ele);
	  List<WebElement> Alloptions=sel.getOptions();
	  int TotalOptions=Alloptions.size();
	  System.out.println("Total Options = "+TotalOptions );
	  sel.selectByIndex(TotalOptions-1);
	  
	  
  }
}
