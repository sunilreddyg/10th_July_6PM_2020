package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_interactions {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement Work_Exp_List=driver.findElement(By.xpath("//input[@id='cjaExp']"));
		Work_Exp_List.click();
		Thread.sleep(2000);
		
		
		//Using keyboard press arrowdown key 3 times and Press Enter key
		new Actions(driver)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.ENTER).perform();
		
		
		WebElement MIn_Sal_List=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		MIn_Sal_List.click();
		Thread.sleep(2000);
		
		
		//Keyboard controls on activeelement
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
