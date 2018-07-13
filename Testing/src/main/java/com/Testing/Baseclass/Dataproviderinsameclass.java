package com.Testing.Baseclass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderinsameclass {
	@DataProvider(name="firstDataPrivider")
	public Object [] [] dataproviding()
	{
		return new Object [] []
				{
			
				{"first set of data"},
				{"second set of data"}
		
				};
		
	}
	@Test(dataProvider="firstDataPrivider")
	public void testfunction(String parameter)
	{
		System.out.println(parameter);
	}
	
	}
	
	


