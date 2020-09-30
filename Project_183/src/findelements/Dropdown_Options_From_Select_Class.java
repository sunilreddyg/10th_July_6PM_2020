package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Options_From_Select_Class {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize(); 
		
		
		
		//Identifying location of Month dropdown
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		//Get Group of options from dropdown using Dropdown Selector
		List<WebElement> Month_options=new Select(Month_Dropdown).getOptions();
		
		//Using foreach loop get Each Opiton From Collection
		for (WebElement EachOpiton : Month_options) 
		{
			System.out.println(EachOpiton.getText());
			EachOpiton.click();
			Thread.sleep(1000);
		}
}

}
