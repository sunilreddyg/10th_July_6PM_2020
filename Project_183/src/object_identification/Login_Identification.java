package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Identification {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Type email
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Type password
		driver.findElement(By.id("pass")).sendKeys("Hello123456");
		
		//Click login button
		driver.findElement(By.id("loginbutton")).click();
	}

}
