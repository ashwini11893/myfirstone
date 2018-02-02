package com.Testing.Commonclass;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportClass {
	
	public static ExtentReports GenerateReport(ExtentReports report)
	{
		File f=new File("Reportsnew");
		File fs= new File(f,"");
		 report= new ExtentReports(fs.getAbsolutePath()+"//thisreport.html",false);
		return report;
		
	}

}
