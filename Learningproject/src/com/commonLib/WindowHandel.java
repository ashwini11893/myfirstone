package com.commonLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandel {

	public static void handelMultipleWindow(WebDriver driver,String windowTitle){

		String pid=driver.getWindowHandle();
		Set<String> windowids=driver.getWindowHandles();
		for(String windowId:windowids){
			if(!windowId.equals(pid)){
				driver.switchTo().window(windowId);
				String title=driver.getTitle();
				if(title.equals(windowTitle)){
					driver.switchTo().window(windowId);
				}
			}
		}

	}

	public static void handelwindowByNo(WebDriver driver,int SwitchToWindowNo){

		Set<String> windowids=driver.getWindowHandles();
		int totalNoOfWIndow=windowids.size();
		System.out.println("Total no of window is "+totalNoOfWIndow);
		if(totalNoOfWIndow>1){
			Iterator<String> itr=windowids.iterator();
			for(int i=1;i<=totalNoOfWIndow;i++){
				String id=itr.next();
				if(i==SwitchToWindowNo){
					driver.switchTo().window(id);
				}
			}
		}

	}

}
