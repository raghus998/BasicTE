package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Read the Excel Sheet
		FileInputStream fis = new FileInputStream("./data/actiTimedata.xls");

		// Create Woorkbook Factory
		Workbook wb = WorkbookFactory.create(fis);

		// get the Sheet
		Sheet sh = wb.getSheet("TC02");
		
		//To get the no of Rows
		int count = sh.getLastRowNum();
		
		System.out.println(count);

	}

}
