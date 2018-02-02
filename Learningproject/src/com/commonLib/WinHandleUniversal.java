package com.commonLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WinHandleUniversal{
	
	public static void HandleWindowByNumber(WebDriver driver, int windowNumber)
	{
		Set<String> win=driver.getWindowHandles();
		int totalnoOfwindows=win.size();
		System.out.println("Total number of windows open"+ totalnoOfwindows);
		Iterator<String> itr=win.iterator();
		//String windowId=itr.next();
		if(totalnoOfwindows>1){
		for(int i=1;i<=win.size();i++)
		{
			String windowId=itr.next();
			if(i==windowNumber)
			{
				driver.switchTo().window(windowId);
			}
		}
		
	}

}
	}
