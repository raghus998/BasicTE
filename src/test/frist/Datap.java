package test.frist;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datap 
{
	@DataProvider
	public String[][] getData()
	{
		String[][] data = new String[2][2];
		data[0][0] = "RS";
		data[0][1] = "RS";
		data[1][0] = "RS";
		data[1][1] = "RS";
		return data;
	}
	
	@Test(dataProvider="getData")
	public void reciveData(String name,String name1)
	{
		Reporter.log("Frist Name  :"+name+"  "+"Last name  :"+name1,true);
	}

}
