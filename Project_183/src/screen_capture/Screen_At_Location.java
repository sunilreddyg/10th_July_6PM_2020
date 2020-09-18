package screen_capture;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Screen_At_Location {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Target locationa at webpage
		WebElement Location=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
		new Actions(driver).moveToElement(Location).perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		
		//Capture Screen and convert into file format
		File srfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy file into local system
		FileHandler.copy(srfile, new File("C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\screens\\image.png"));
		
		
		
		
				

	}

}
