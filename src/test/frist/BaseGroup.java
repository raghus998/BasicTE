package test.frist;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseGroup
{
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("User Loged In",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logOut()
	{
		Reporter.log("User Loged Out",true);
	}
	
	
	

}
