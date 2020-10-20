package chrome_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Headless {

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		System.out.println("Browser Is up and ready for use");
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Email.clear();
		Email.sendKeys("info.dsnr@gmail.com");
		System.out.println("Email Enter successfull");
		

	}

}
