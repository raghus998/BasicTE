package test.frist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SAs1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void verifyTitle1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String eTitle = driver.getTitle();
		String aTitle = "actiTIME - Log   in ";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		driver.close();
		sa.assertAll();
  }
}