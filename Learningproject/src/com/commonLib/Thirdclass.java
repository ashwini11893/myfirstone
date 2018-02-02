package com.commonLib;

import org.testng.annotations.Test;

public class Thirdclass {
	
  @Test(dependsOnGroups={"G3"})
  public void a1() 
  {
	  System.out.println("haiiii from a1");
  }
  @Test(groups={"G2"})
  public void a2() 
  {
	  System.out.println("haiiii from a2");
  }
  @Test(groups={"G3"})
  public void a3() 
  {
	  System.out.println("haiiii from a3");
  }
  @Test(groups={"G4"})
  public void a4() 
  {
	  System.out.println("haiiii from a4");
  }
}
