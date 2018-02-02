package com.com.commonLib;

import org.testng.annotations.Test;

public class fourthclass {
  @Test(priority=2, enabled=false)//to skip the @test
  public void A1() {
	  System.out.println("A1 PASS");
  }
  @Test(priority=1)
  public void A2() {
	  System.out.println("A2 PASS");
  }
  @Test(priority=0)
  public void A3() {
	  System.out.println("A3 PASS");
  }
}
