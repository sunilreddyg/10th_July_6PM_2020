package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_implicitWaits {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Assign Dynamic Implicit wait for Automation browser.
		driver.manage().timeouts()
		.implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(50, TimeUnit.SECONDS)
		.setScriptTimeout(50, TimeUnit.SECONDS);
		
		//load webpage
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
				
	
		
		
		

	}

}
