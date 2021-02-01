package test.second;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB 
{
	@Test(priority =1)
	public void testB()
	{
		Reporter.log("Test B....",true);
	}
	
	@Test(priority = 2)
	public void testC()
	{
		Reporter.log("Test C....",true);
	}
	
	@Test(priority = 3)
	public void testA()
	{
		Reporter.log("Test A....",true);
	}

}
