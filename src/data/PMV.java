package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PMV 
{
	public static void main(String[] args) throws Exception
	{
		File fis1 = new File("./data/actiTimedata.xls");
		FileInputStream fis = new FileInputStream(fis1);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("TC02");
		int rc = sh.getLastRowNum();
		/*for (int i = 0; i <= rc; i++)
		{
			Row r = sh.getRow(i);
			short cc = r.getLastCellNum();
			for (int j = 0; j <cc; j++) 
			{
				Cell c = r.getCell(j);
				String text = c.getStringCellValue();
				System.out.print(text+"  ");
			}
			System.out.println();
		}*/
		for (int i = 0; i <=rc; i++) 
		{
			short cc = sh.getRow(i).getLastCellNum();
			for (int j = 0; j <cc; j++) 
			{
				String text = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(text+" ");
			}
			System.out.println();	
		}
	}
}
