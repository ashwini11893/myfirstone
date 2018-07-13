package com.Firstproject.one;

import org.testng.annotations.Test;

public class NewTest {
//	
// @Test
//  public void f() {
//	  String name="happy12311sdsf123 345bffcvfcvf";
//	     String no="";
//		String result="";
//	char[] c=name.toCharArray();
//	 for(int i=0;i<c.length;i++){
//		 try{
//			 Integer.parseInt(c[i]+"");
//			continue;
//		 }catch(Throwable t){
////			 result=c[i]+"";
//		 }
//		 System.out.print(result);
//
//	 }
//	 System.out.println("/t");
//  }
  
@Test
  public void f1() {
	  String name="happy helo 12343 fdhg";
	    
		String result="";
	char[] c=name.toCharArray();
	 for(int i=0;i<c.length;i++){
		 if(Character.isDigit(c[i])==false){
			 result=result+c[i];
		 }
		
	 }
	 System.out.print(result);
  }
}
