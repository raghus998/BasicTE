package test.second;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP 
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "RS1";
		data[0][1] = "RS2";
		data[1][0] = "RS3";
		data[1][1] = "RS4";
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void printData(Object n1,Object n2)
	{
		Reporter.log(n1+"  "+n2,true);
	}

}
