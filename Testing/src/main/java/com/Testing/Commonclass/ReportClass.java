package com.Testing.Commonclass;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportClass {
	static ExtentReports report1;
	public static ExtentReports GenerateReport()
	{
		File f=new File("Reportsnew");
		File fs= new File(f,"");
		report1= new ExtentReports(fs.getAbsolutePath()+"//thisreport.html",false);
		  return report1;
		
	}

}
