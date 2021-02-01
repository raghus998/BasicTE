package test.frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SAs3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@Test
	public void verifyCheckBoxIsSelected()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement check = driver.findElement(By.name("remember"));
		boolean r = check.isSelected();
		boolean c1 = true;
		SoftAssert sa = new SoftAssert();
		sa.assertFalse(c1);
		driver.close();
		sa.assertAll();	
	}
}