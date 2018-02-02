package com.commonLib;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class firstclass {
  @Test (groups = { "groupone" })
  public void M1() {
	  System.out.println("METHOD1 EXECUTED");
  }
  @Test (groups={"grouptwo"})
  public void M2tofind() {
	  System.out.println("M2tofind- gropuptwo EXECUTED");
  }
  @Test(groups={"groupone"})
  public void M2tocheck() {
	  System.out.println("M2tocheck EXECUTED");
  }
  @Test(groups={"groupone"})
  public void M3() {
	  System.out.println("M3 EXECUTED");
  }
  @Test(groups={"grouptwo"})
  public void M4() {
	  System.out.println("M4 EXECUTED");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

}
