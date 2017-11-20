package com.commonLib;

import java.io.File;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Practicesnapshot {
	public static void takePicture(WebDriver driver,String method) throws IOException
	{
		EventFiringWebDriver efd= new EventFiringWebDriver(driver);
		File sfile=efd.getScreenshotAs(OutputType.FILE);
		File dfile= new File("D:\\selenum_pgm\\Learningproject\\ss\\"+method+".png");
		FileUtils.copyFile(sfile, dfile);
	}


}
