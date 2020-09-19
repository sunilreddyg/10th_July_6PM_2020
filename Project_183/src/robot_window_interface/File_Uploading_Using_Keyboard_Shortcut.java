package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Uploading_Using_Keyboard_Shortcut {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		
		WebElement Fresher_Profile=driver.findElement(By.xpath("//button[@value='fresher']"));
		Fresher_Profile.click();
		Thread.sleep(4000);
		
		
		WebElement Upload_CV=driver.findElement(By.xpath("//input[@name='uploadCV']"));
		new Actions(driver).click(Upload_CV).perform();
		Thread.sleep(4000);
		
		
		String text="C:\\Users\\SUNIL\\Documents\\Fresher_Resume\\SunilResume.docx";
		//String Selection
		StringSelection Stext=new StringSelection(text);
		//Get System Default Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Attach selected string to runtime clipboard
		clipboard.setContents(Stext, Stext);
		
		

		// Creating object creation for robot interface
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Because control is downkeys we must release after pressing it
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
