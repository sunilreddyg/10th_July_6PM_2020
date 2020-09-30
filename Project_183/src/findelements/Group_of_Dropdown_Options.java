package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_of_Dropdown_Options {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize(); 
		
		
		//Identify State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Finding list of options under dropdown
		List<WebElement> State_options=State_Dropdown.findElements(By.tagName("option"));
		System.out.println("State dropdown options count is --> "+State_options.size());
		
		
		//Get 4th Position option from StateDropdown list
		State_options.get(4).click();
		
		
		//Iterate for number of options
		for (int i = 1; i < State_options.size(); i++) 
		{
			//Get Each option using Index number.
			State_options.get(i).click();
			Thread.sleep(2000);
			
		}
		
		
		

	}

}
