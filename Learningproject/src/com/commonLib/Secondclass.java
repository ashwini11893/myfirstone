package com.commonLib;

import org.testng.annotations.Test;

public class Secondclass {
	
	
  @Test(dependsOnMethods="n2")
  public void n1() {
	  System.out.println("n1 is last");
  }
  
  @Test(dependsOnMethods="n3")
  public void n2() {
	  System.out.println("ne will execute second");
  }
  @Test
  public void n3() {
	  System.out.println("n3 will execute first");
  }
}
