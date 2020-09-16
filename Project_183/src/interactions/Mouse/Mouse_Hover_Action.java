package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> 
		 * 			Given url is "http://naukri.com"
		 * 			When user hover on jobs at main menu
		 * 			Then it display list of sub menu items under main menu.
		 */
		
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Perform MouseHover action on Location
		WebElement Jobs_menu=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		new Actions(driver).moveToElement(Jobs_menu).perform();
		
		//Perform Click Action using Mouse Interactions class
		WebElement Register_SubMenu=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
		new Actions(driver).click(Register_SubMenu).perform();
		
		
		
		
		
		

		
		
		
		

	}

}
