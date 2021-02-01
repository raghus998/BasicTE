package test.frist;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IT
{
	@BeforeMethod
	public void preCondition()
	{
		Reporter.log("User Login In",true);
	}
	
	@Test
	public void actions()
	{
		Reporter.log("User did his work",true);
	}
	
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int status = res.getStatus();
		String name = res.getName();
		Reporter.log("Status :"+status,true);
		Reporter.log("The Name of Test is :"+name,true);
	}

}
