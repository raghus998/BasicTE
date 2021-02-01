package test.second;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoA //extends BaseTest
{
	@Test
	public void createUser()
	{
		Reporter.log("User Created",true);
		Assert.fail();
	}
	
	@AfterMethod
	public void testA(ITestResult res)
	{
		String name = res.getName();
		int status = res.getStatus();
		Reporter.log(name+"  "+status,true);
	}

}
