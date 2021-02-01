package test.frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SAs2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void verifyUNField()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement UNTB = driver.findElement(By.id("username"));
		boolean v = UNTB.isDisplayed();
		boolean v1 = false;
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(v1);
		driver.close();
		sa.assertAll();

    }
}