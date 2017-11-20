package com.commonLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
public class PracticeWindowHadlebynum1{
	WebDriver driver;
	public static void winHandles(WebDriver driver,int NoOfWindow)
	{
		Set<String> windows=driver.getWindowHandles();
		int countOfWindows=windows.size();
		System.out.println(countOfWindows);
		if(countOfWindows>1)
		{
			Iterator<String> itr=windows.iterator();
			//String id=itr.next();
			for(int i=1;i<=countOfWindows;i++)
			{
				String id=itr.next();
				if(i==NoOfWindow)
				{
					driver.switchTo().window(id);
				}
			}
		
		}
		
	
		


	}

}
