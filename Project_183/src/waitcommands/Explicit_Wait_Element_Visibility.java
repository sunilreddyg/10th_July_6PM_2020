package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Element_Visibility {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement More_options=driver.findElement(By.xpath("//strong[contains(.,'More options:')]"));
		More_options.click();   //This action will bring class of travel dropdown to visible
		
		
		//Manage timegap until expected object visible at webpage
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.id("Class")));
		System.out.println("Class Travel dropdown visible at webpage");
		
		
		Thread.sleep(5000);
		More_options.click();   //This action will hide Class of travel dropdown
		
		
		//Manage timegap until expected object Hide from webpage
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.id("Class")));
		System.out.println("Timeout released element is hidden at webpage");

	}

}
