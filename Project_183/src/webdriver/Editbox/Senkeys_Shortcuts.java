package webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Senkeys_Shortcuts {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Arjun"+Keys.TAB
				+"Krishna"+Keys.TAB
				+"Arjunkrishna@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email_confirmation__"))
		.sendKeys("ArjunKrishna@gmail.com"+Keys.TAB+"Hello123456");
		
		
		
		Thread.sleep(2000);
		//Select dropdown using keyboard characters.
		driver.findElement(By.id("day")).sendKeys("17");
		
		Thread.sleep(2000);
		//Select dropdown using keyboard characters.
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		Thread.sleep(2000);
		//Select dropdown using keyboard characters.
		driver.findElement(By.id("year")).sendKeys("1990");
		
		
		Thread.sleep(2000);
		//Select Radio button using keyboard shortcuts
		driver.findElement(By.xpath("//input[@value='2']")).sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		//Submit button using keybaord shortcut
		driver.findElement(By.name("websubmit")).sendKeys(Keys.ENTER);
		
		
		/*
		 * Note:--> Inorder to select Dropdown, Checkbox , Radio button, Link and button webdriver
		 * 			have separate commands.Above example is only shortcut option to operate these elements.
		 */
		
		
		
	}

}
