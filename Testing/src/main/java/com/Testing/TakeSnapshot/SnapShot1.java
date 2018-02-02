package com.Testing.TakeSnapshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SnapShot1 {
	
	public static String SnapshotTake(WebDriver driver,String SnapShotName) throws IOException
	{
		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		File f= new File("Snapshots");
		File fs=new File(f,"");
		File dstFile= new File(fs.getAbsolutePath()+"//"+SnapShotName+".png");
		FileUtils.copyFile(srcFile, dstFile);
		String path=fs.getAbsolutePath()+"//"+SnapShotName+".png";
		return path; 
		
		
	}

}
