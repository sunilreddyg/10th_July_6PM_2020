package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Title_presented_At_Webpage 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println("Browser is up and running");
		
		
		
		new WebDriverWait(driver, 50).until(ExpectedConditions.titleContains("Facebook"));
		System.out.println("Expected title is presented");
		
		
		WebElement Messenger_Link=driver.findElement(By.linkText("Messenger"));
		Messenger_Link.click();
		
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs("Messenger"));
		System.out.println("Expected Title presented at messenger page");
		
		
		
		

	}

}
