package webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_Dropdown_Option_From_MultipleSelection {

	public static void main(String[] args) throws Exception 
	{


		/*
		 * Note:--> All Deselect options should try only on multiple selection dropdowns
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		/*
		 * Create Multiple Selection dropdown using javascript.
		 * 	Note:--> It is not a Testng Engineer job..
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById('customState')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		
		//This line verify dropdown is a multiple selection type and return boolean value true/false.
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		
		
		//Decision to accept on Multiple Selection type
		if(flag==true) 
		{
			System.out.println("Dropdown is multiple selection type");
			
			//For Single /Multiple dropdown options we follow same commands
			Select StateDropdown=new Select(driver.findElement(By.id("customState")));
			StateDropdown.deselectAll();
			StateDropdown.selectByIndex(2);
			StateDropdown.selectByIndex(4);
			StateDropdown.selectByIndex(6);

			
			//Verifying dropdown selection count equals to 3
			int Selection_Count=StateDropdown.getAllSelectedOptions().size();
			if(Selection_Count == 3)
			{
				//Deselect any single option from multiple selection tyep
				StateDropdown.deselectByIndex(4);
				
				//verifying dropdown selection count
				int Deselection_Count=StateDropdown.getAllSelectedOptions().size();
				if(Deselection_Count ==2)
				{
					System.out.println("Dropdown allowed to deselect single option from multiple selection");
				}
				else
				{
					System.out.println("Dropdown is a not allowd user to deselection single option from multipel selection");
				}
				
			}
			else
			{
				System.out.println("Multiple Selection is less than two");
			}
			
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
