package com.Testing.Commonclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandleByNum {
	static WebDriver driver;
	public static void WindHandles(int WindowNum)
	{
		Set<String> windows=driver.getWindowHandles();
		int TotalWindows= windows.size();
		System.out.println(TotalWindows);
		Iterator<String> itr= windows.iterator();
		if(TotalWindows>1)
		{
			 String windowid=itr.next();
			 for(int i=1;i<=TotalWindows;i++)
			 {
				 if(i==WindowNum){
					 driver.switchTo().window(windowid);
				 }
			 }
		}
	}
	

}
