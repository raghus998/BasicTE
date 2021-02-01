package test.frist;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends 
{
	@Test
	public void mother()
	{
		Assert.fail();
		Reporter.log("Mother is God",true);
	}
	
	@Test(dependsOnMethods = "mother")
	private void child() 
	{
		Reporter.log("For every Child",true);

	}

}
