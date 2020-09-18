package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown_And_Keyup_Interactions {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement Demo_Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(Demo_Frame);
		Thread.sleep(2000);
		
		//Press Control down button
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		//Select Items
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		
		//Release Control button
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		
		
		

	}

}
