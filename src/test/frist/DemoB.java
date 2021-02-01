package test.frist;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB  extends BaseTest
{
	@Test(priority = 1)
	public void editUser()
	{
		Reporter.log("User Edited.......",true);
	}
	
	@Test(priority = 2)
	public void deleteUser()
	{
		Reporter.log("User Deleted....",true);
	}

}
