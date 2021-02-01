package test.frist;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method.....",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("After Method.....",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before Class.....",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After Class.....",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before Test.....",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After Test.....",true);
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("Before Suite.....",true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("After Suite.....",true);
	}
}
