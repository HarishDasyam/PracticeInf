package com.basic.java;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class BrowserOpenCloseUsingJunit
{
	public WebDriver driver;
	//int count =0;
	/*@BeforeClass
	public void preConditions()
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\PraticePrograms\\Practice\\chromedriver.exe");
		driver.get("http://leaftaps.com/opentaps/control/main");
	}*/
	@Before
	public void beforeEachTest()
	{
		System.out.println("Lord Balaji");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\PraticePrograms\\Practice\\chromedriver.exe");
		driver.get("http://leaftaps.com/opentaps/control/main");
		//System.out.println("Test: "+(count++));
	}
	/*@Test
	public void test()
	{
	System.out.println(""+driver.getTitle());	
	}*/
	@Test
	public void elementIdentification() throws InterruptedException, IOException
	{
		String text = driver.getTitle();System.out.println(text);
		String actualText = "Leaftaps - TestLeaf Automation Platform";
		Assert.assertEquals(text,actualText);
		String filePath = System.getProperty("user.dir") + "\\hssh.xlsx";System.out.print(filePath);
		FileInputStream fileStream = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();System.out.print(rowCount);
		for(int ii=1;ii<=rowCount;ii++)
		{
		driver.findElement(By.id("username")).sendKeys(sheet.getRow(ii).getCell(0).getStringCellValue());
		driver.findElement(By.id("password")).sendKeys(sheet.getRow(ii).getCell(1).getStringCellValue());	
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AON");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hssh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("hssh");
		/*driver.findElement(By.className("smallSubmit")).click();
		*/
		driver.findElement(By.cssSelector("input[class='smallSubmit']")).click();
		driver.findElement(By.xpath("//input[@type ='submit' and @class='smallSubmit' and @name='submitButton']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'attrName')]")).sendKeys("hssh");
		driver.findElement(By.xpath("//input[starts-with(@id,'attrValue')]")).sendKeys("hssh");
		driver.findElement(By.xpath("//input[starts-with(@id,'attrValue')]/following::img[1]")).click();
		driver.findElement(By.tagName("button"));
		driver.findElement(By.cssSelector("a[href='/crmsfa/control/myHomeMain']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'accountN')]")).sendKeys("InfSolutions HSSHHSSHHSSH");
		WebElement ele = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		driver.findElement(By.cssSelector("input[class='smallSubmit']")).click();
		driver.findElement(By.partialLinkText("Tea")).click();
		driver.findElement(By.linkText("Demo Sales Team No. 1")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='crmsfaListTable']"));
		List<WebElement> listrows = table.findElements(By.tagName("tr"));
		for(WebElement i: listrows)
		{
			List<WebElement> column = i.findElements(By.tagName("td"));
			for(WebElement j:column)
			{
				System.out.println(j.getText());
			}
		}
		//driver.switchTo().window("0");
		System.out.println(driver.getTitle());
		File filehssh = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(filehssh, new File("E:\\PraticePrograms\\Practice\\Generate//image.png"));
		//driver.findElement(By.cssSelector("button[class='x-btn-text']")).click();
		//driver.switchTo().alert().dismiss();
		/*Object[][] data = null ;
		XSSFWorkbook workbook = new XSSFWorkbook("E:\\PraticePrograms\\Practice\\hssh.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		data = new String[rowCount][columnCount];
		for(int i=1; i <rowCount+1; i++){
			try 
			{
				XSSFRow row = sheet.getRow(i);
				for(int j=0; j <columnCount; j++){ // loop through the columns
					try 
					{
						String cellValue = "";
						try
						{
							cellValue = row.getCell(j).getStringCellValue();
						}
						catch(NullPointerException e)
						{

						}
						data[i-1][j]  = cellValue; // add to the data array
						System.out.println("");
						System.out.println(data[i-1][j]);
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}				
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}	
		workbook.close();*/workbook.close();
		driver.close();
		}
	}
/*	@Test
	public void nextPage()
	{
	
	}
*/	@After
	public void closeBrowser()
	{
	//driver.close();
	}
}