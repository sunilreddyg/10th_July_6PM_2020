package webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_With_KEYS {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Type email and press Keyboard shortcut "Enter"
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		Thread.sleep(5000);
		
		//Type password and press Keyboard shortcut "Enter"
		driver.findElement(By.name("password")).sendKeys("sunil680806"+Keys.ENTER);
		

	}

}
