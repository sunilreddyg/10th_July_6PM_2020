package framework.datadriven.poi;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Testcase_From_Excel 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("file located");
		
		//Access workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Get sheet access using index number
		HSSFSheet sht=book.getSheet("Testcase");
		
		//Target row
		HSSFRow row=sht.getRow(6);
		
		
		//Get Cell Data
		String input_url=row.getCell(0).getStringCellValue();
		String obj_Nav_signin_btn=row.getCell(1).getStringCellValue();
		String obj_email=row.getCell(2).getStringCellValue();
		String input_email=row.getCell(3).getStringCellValue();
		String obj_email_next_btn=row.getCell(4).getStringCellValue();
		
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.manage().window().maximize(); 
		driver.get(input_url);
		
		//Click Signin navigation button
		driver.findElement(By.xpath(obj_Nav_signin_btn)).click();
		
		//Locate email and type text into editbox
		driver.findElement(By.xpath(obj_email)).clear();
		driver.findElement(By.xpath(obj_email)).sendKeys(input_email);
		
		//Click Email Next validation button
		driver.findElement(By.xpath(obj_email_next_btn)).click();
		
		
				
		

	}

}
