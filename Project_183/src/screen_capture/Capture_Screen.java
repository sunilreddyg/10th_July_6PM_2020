package screen_capture;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Capture Screen and convert into file format
		File srfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy file into local system
		FileHandler.copy(srfile, new File("C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\screens\\image.png"));
		
		
		/*
		 * Disadvantage of screen Capture at selenium-webdriver:-->
		 * 		1. Can't take screenshot when alert presented
		 * 		2. Only Capture Visible Interface [Top Interface]
		 * 		3. Image Override everytime, Incase File name not changed.
		 */
		
		
		

	}

}
