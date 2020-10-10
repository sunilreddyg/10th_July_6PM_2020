package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Url_Presented {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println("Browser is up and running");
		
		//Managing explicit timegap until expected url presented at browser window
		new WebDriverWait(driver, 30).until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
		System.out.println("Expected url loaded to browser window");
		
		
		WebElement Download_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Download_link.click();
		
		
		//Managing explicit timegap until Partial url presented at browser window
		new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains("downloads/"));
		System.out.println("Expected partial url presented at browser window");
		
		
		
		
		
		
	}

}
