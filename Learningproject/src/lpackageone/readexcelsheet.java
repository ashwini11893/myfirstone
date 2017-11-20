package lpackageone;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readexcelsheet {
  @Test
  public void f() throws EncryptedDocumentException, InvalidFormatException, IOException {
	  FileInputStream fis= new FileInputStream("C:\\Users\\Happy\\Desktop\\selenium test.xlsx");
	 
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("Sheet1");
	for(int j=0;j<2;j++)
	{
	Row r= sh.getRow(j);
	
	for(int i=0;i<6;i++)
	{
	//Cell val= r.getCell(1);
	String val1= r.getCell(i).getStringCellValue();
	System.out.println(val1);
	}
	
	}
	int cl= sh.getPhysicalNumberOfRows();
	System.out.println(cl);
	
	
  }
}

