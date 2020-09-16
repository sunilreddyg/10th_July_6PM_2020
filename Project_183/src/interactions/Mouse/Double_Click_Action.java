package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Action {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.telerik.com/forums/single-click-instead-of-double-click");
		driver.manage().window().maximize();
		
		
		//Perform double click at Selected location
		WebElement Reply_btn=driver.findElement(By.xpath("//input[@type='btn']"));
		new Actions(driver).doubleClick(Reply_btn).perform();
	}

}
