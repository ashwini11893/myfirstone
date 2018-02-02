package com.commonLib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newparameter {
	
	WebDriver driver;
	  @Parameters({"username","password"})
	  @Test
	  public void TestParameters(String username1, String password1) 
	  {
		  System.out.println(username1);
	    System.out.println(password1);
	  }
}
