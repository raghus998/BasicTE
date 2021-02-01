package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	//Read the Excel Sheet
		FileInputStream fis = new FileInputStream("./data/actiTimedata.xls");
		
		//Create Woorkbook Factory
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the Sheet
		Sheet sh = wb.getSheet("TC01");
		
		//Get the Row
		Row r = sh.getRow(0);
		
		//Get the no of cells 
		short count = r.getLastCellNum();
		
		System.out.println(count);
		
	

	}
}
