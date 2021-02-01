package TFS;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class tfs2
{
	

 
		static WebDriver driver;
		static String[] listOfTestSteps;
		
		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		public static void logOnToTFS(String userName, String password) throws InterruptedException {
			String s = "https://"+userName+":"+password+"@gasprtfsapp01/Greenway/PrimeSuite/_testManagement#planId=380870&suiteId=381572&_a=tests/";
			driver.navigate().to(s);
			Thread.sleep(10000);
			driver.manage().window().maximize();
//			driver.findElement(By.xpath(".//*[@id='mi_58']/span")).click();
//			Actions action = new Actions(driver);
//			Thread.sleep(8000);
//			action.contextClick(driver.findElement(By.xpath("//div[@class='node-content']")));
//			action.build().perform();
//			driver.findElement(By.xpath("//*[.='Export']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[.='Print']")).click();
//			Thread.sleep(20000);
//			Set<String> window = driver.getWindowHandles();
//			System.out.println(window.size());
//			System.out.println(window);
//			Thread.sleep(3000);
//			int count=0;
//			for(String sent: window) {
//				
//				try{driver.switchTo().window(sent);
//				driver.switchTo().activeElement().findElement(By.xpath("//*[.='Save']")).click();
//				System.out.println("test"+count);
////				Actions action1 = new Actions(driver);
////				action1.sendKeys(Keys.ENTER);
////				action1.build().perform();
//				Pattern p = new Pattern("D:\\TFS\\save.png");
//				Screen save= new Screen();
//					save.click(p);
//				}
//				catch(Exception e) {count++;}
//			}
//			Thread.sleep(3000);
			
			
		}
		public static void getListOfTestSteps(String id) throws InterruptedException, InvalidFormatException, IOException {
			FileInputStream file = new FileInputStream("D:\\Raghu\\Workspace\\BasicTE\\Text.xls");
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet("Accoun");
			driver.findElement(By.xpath("//input[@id='multi-entity-search-box']")).clear();
			driver.findElement(By.xpath("//input[@id='multi-entity-search-box']")).sendKeys(id);
			driver.findElement(By.xpath("//span[@aria-label='Search']")).click();
			Thread.sleep(20000);
//			String list_id= driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']")).getAttribute("aria-rowcount");
			//div[@class='grid-canvas']/div/div[2]
			List<WebElement> steps= driver.findElements(By.xpath("//div[@class='grid-canvas']/div"));
			System.out.println(id);
			int NoOfSteps= steps.size();
			System.out.println(NoOfSteps);
			String[] main= null;
			for(int i=0; i<NoOfSteps-1;i++) {
//				System.out.println(driver.findElement(By.xpath("//div[@class='grid test-steps-list has-header']//*[@id='row_"+list_id+"_"+i+"']")).getText());
				//row_vss_529_10
				Row r= sh.createRow(i);
				Cell c= r.createCell(0);
//				System.out.println("//*[@id='row_vss_529_"+i+"']");
//				c.setCellValue(driver.findElement(By.xpath("//*[@id='row_vss_529_"+i+"']")).getText());
//				String s1= driver.findElement(By.xpath("//*[@id='row_vss_529_"+i+"']")).getText();
				String s1= steps.get(i).getText();
				s1=s1.replaceFirst("[\r\n]+", "");
				String[] t=s1.split("[\r\n]+");
				
				if(t.length>2) {
				s1=s1.replaceFirst("[\r\n]+", "\r\n"+"Expected Result :- ");
				}
				else {
					s1=s1.replaceFirst("[\r\n]+","");
					
				}
//				int b = i+1;
//				s1 = ""+b+". "+s1;
				System.out.println(s1);
				

//				main[i]=s1;
			}
			driver.findElement(By.xpath("/html/body/div/div[1]/button")).click();
//			FileOutputStream fout = new FileOutputStream("C:\\Users\\gireeshk\\Downloads\\eclipse\\ExcelPro\\InputExcel.xlsx");
//	    	wb.write(fout);
		}
		public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
			
			String userName = "rsangoji.gmt";
			String password = "Healthrs920@";
			logOnToTFS(userName,password);
			String[] tc= {"199691","199717","355694"};
			for(int i=0;i<tc.length;i++) {
				getListOfTestSteps(tc[i]);
			}
		}

	}


