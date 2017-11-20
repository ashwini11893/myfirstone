package lpackageone;

import org.apache.xpath.axes.FilterExprWalker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.BreakStatement;
// ***************pagination***************
public class pagination {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sachin",Keys.ENTER);
	  boolean c=true;
	  int count=0;
	  while(true)
	  {
	  try {
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(3000);
		  count++;

		
	} catch (Exception e) 
	  {
		break;
		
		
	}
	  
	}
	  System.out.println(count);
  }
}
