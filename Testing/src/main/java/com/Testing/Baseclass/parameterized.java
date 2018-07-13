package com.Testing.Baseclass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized {
	@Parameters("suite level par")
	@Test
	public void firsttest(String parameter)
	{
	System.out.println(parameter);
		
	}
	
	@Parameters("test level par")
	@Test
	public void Secondtest(String parameter)
	{
	System.out.println(parameter);
		
	}

	@Parameters({"test level par one","suite level par"})
	@Test
	public void thirdtest(String suiteparameter1,String testparameter2 )
	{
	System.out.println(suiteparameter1+ "********" + testparameter2);
		
	}


}
