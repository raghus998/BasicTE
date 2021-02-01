package test.frist;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Group 
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
	  
	@Test(priority = 1,groups = {"user","smoke"})
	public void CreateUser()
	{
		Reporter.log("User Created.....",true);
	}
	
	@Test(priority = 2,groups = "user")
	public void editUser()
	{
		Reporter.log("User Edited.....",true);
	}
	
	@Test(priority = 3,groups = "user")
	public void deleteUser()
	{
		Reporter.log("User Deleted.....",true);
	}
	
	
	@Test(priority = 4,groups = {"tasks","smoke"})
	public void createTask()
	{
		Reporter.log("Task Created.......",true);
	}
	
	@Test(priority = 5,groups = "tasks")
	public void editTask()
	{
		Reporter.log("Task Edited........",true);
	}
	
	@Test(priority = 6,groups = "tasks")
	public void deleteTask()
	{
		Reporter.log("Task Deleted........",true);
	}
}
