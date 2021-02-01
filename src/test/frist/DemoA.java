package test.frist;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA  extends BaseTest
{
	@Test
	public void createUser()
	{
		Reporter.log("User Created.......",true);
	}
}
