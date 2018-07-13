package com.Firstproject.com.Firstproject.one;

import org.testng.annotations.Test;

public class NewTest123 {
  @Test
  public void f() {
	  String name="happy123 lsjrg jpokjw 14324";
	    String no="";
		String result="";
	char[] c=name.toCharArray();
	 for(int i=0;i<c.length;i++){
		 if(Character.isDigit(c[i])){
			  continue;
		 }else{
			 result=c[i]+"";
		 }
		 System.out.print(result);
	 }
	
}
}
