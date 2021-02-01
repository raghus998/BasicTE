package test.frist;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple
{
	@Test(invocationCount = 5)
	public void Try()
	{
		Reporter.log("Give a Try",true);
	}
}
