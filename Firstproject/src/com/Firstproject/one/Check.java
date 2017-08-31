package com.Firstproject.one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Check {

  @BeforeClass
	  public void beforeClass() {
	  System.out.println(" HELLO BEC");
	  }
  @Test(priority=3)
  public void f() {
	  
	  System.out.println("ASEE THIS");
  }
  @Test(priority=2)
  public void f1() {
	  
	  System.out.println("DSEE THIS1");
  }
  @Test(priority=1)
  public void f2() {
	  
	  System.out.println("BSEE THIS2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" BM");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
  }

 

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
  }

}
