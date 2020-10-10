package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementTobe_Clickable {

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		
		
		//Type Email and wait until Next button Clickable
		WebElement Email=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email.clear();
		Email.sendKeys("sunilreddy@mindqsystems.com");
		
		
		
		//Manage timegap until Element to be clickable
		By Next_btn=By.xpath("//div[@class='VfPpkd-RLmnJb']");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(Next_btn)).click();
		
		
		
		
		
		
		

	}

}
