package lpackageone;

import org.testng.annotations.Test;
//********* armstrong numbers****************

public class armstrongnum {
  @Test
  public void f() {
	  int n1=0,n2=1,n3,i,count=20;
	  //System.out.println(n1+n2);
	  for( i=2;i<count;i++)
	  {
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  System.out.println(n3);
		  
	  }
	  
  }
}
