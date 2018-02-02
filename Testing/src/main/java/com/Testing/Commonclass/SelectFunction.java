package com.Testing.Commonclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectFunction {
	WebDriver driver;
	public void SelectItByIndex(WebElement ElementToSelect, int IndexNum)
	{
	  Select sel=new Select(ElementToSelect);
	  sel.selectByIndex(IndexNum);
	}
	public void SelectItByvalue(WebElement ElementToSelect, String value)
	{
	  Select sel=new Select(ElementToSelect);
	  sel.selectByValue(value);
	
	}
	public void SelectItByVisibletEXT(WebElement ElementToSelect, String TEXT)
	{
	  Select sel=new Select(ElementToSelect);
	  sel.selectByVisibleText(TEXT);
	}
	public void alloptions(WebElement ElementToSelect)
	{
		Select sel=new Select(ElementToSelect);
		List<WebElement> options=sel.getOptions();
		int numOfOptions=options.size();
	   System.out.println("Total number of options=" +numOfOptions );
		for(int i=0;i<numOfOptions;i++){
			String  text=options.get(i).getText();
			System.out.println(text);
		}
		
	}

	public void LastOption(WebElement ElementToSelect)
	{
		Select sel=new Select(ElementToSelect);
		List<WebElement> options=sel.getOptions();
		int Totaloptions=options.size();
		sel.getOptions().get(Totaloptions-1);
		String lastOpt=options.get(Totaloptions-1).getText();
		System.out.println("last option is "+ lastOpt );
	}
}
