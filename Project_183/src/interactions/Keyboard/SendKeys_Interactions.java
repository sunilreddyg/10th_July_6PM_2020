package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Interactions {

	public static void main(String[] args) throws Exception {
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Keyboard shortcust without using Actions class
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.sendKeys("Newuser"+Keys.TAB+"WebDriver"+Keys.TAB+"NewuserWebDriver");

		
		//Using Actions class
		new Actions(driver).sendKeys(Firstname, "Arjun")
		.pause(2000).sendKeys(Keys.TAB)
		.pause(2000).sendKeys("Shyam")
		.pause(2000).sendKeys("ArjunShyam@gmail.com").perform();
		
		
		
		
		
		
		
	}

}
