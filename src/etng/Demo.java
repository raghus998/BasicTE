package etng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void DemoA()
	{
		Reporter.log("DemoA method",true);
	}
	
	@Test
	public void DemoB()
	{
		Reporter.log("DemoB method",true);
	}
	
	@Test
	public void DemoC()
	{
		Reporter.log("DemoC method",true);
	}

}
