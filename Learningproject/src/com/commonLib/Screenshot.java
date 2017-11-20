package com.commonLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Screenshot {

	public static void takeAScreenShot(WebDriver driver,String medhodName) throws IOException{
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		File  dstFile=new File("D:\\selenum_pgm\\Learningproject\\ss\\"+medhodName+".png");
		FileUtils.copyFile(srcFile, dstFile);
		
	}
	
	
}
