package para;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demopara {
	@Parameters({"city","area"})
	@Test
	public void testpara(String city,String area)
	{
		Reporter.log(city,true);
		Reporter.log(area,true);
	}
	

}
