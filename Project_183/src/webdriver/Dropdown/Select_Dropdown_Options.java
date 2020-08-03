package webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		/*
		 * Whenever your are selecting Select tag dropdowns follow below syntax.
		 * 		new Select(WebElement).SelectByVisibleText("");
		 */
		
		new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		Thread.sleep(4000); //Timeout to load cities under state
		
		
		//Selecting dropdown option with Value property
		new Select(driver.findElement(By.id("customCity"))).selectByValue("hyderabad");
		Thread.sleep(2000); 
		
		
		//Type Text into locality editbox
		driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		Thread.sleep(2000); 
		
		
		//Selecting dropdown using option index,
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		
		/*
		 * In webdriver we follow click method inorder to check & uncheck chekcboxes
		 */
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Click Signin button
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
		
		

	}

}
