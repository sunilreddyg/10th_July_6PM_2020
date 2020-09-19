package robot_window_interface;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Downloading_Using_robotClass {

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",driver_path);
					
		//browser initiation command
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		//Identify selenium latest version link
		WebElement Latest_Version=driver.findElement(By.xpath("(//a[contains(.,'3.141.59')])[1]"));
		Latest_Version.click();
		Thread.sleep(3000);
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release shift downkey
		robot.keyRelease(KeyEvent.VK_SHIFT);
	
		
		
	}

}
