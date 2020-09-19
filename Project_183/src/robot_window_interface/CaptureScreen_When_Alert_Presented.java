package robot_window_interface;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_When_Alert_Presented {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert_link=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    Alert_link.click();
	    Thread.sleep(4000);
	    
	    
	    //Using Robot capture screenshot of webpage
	    
	    
	    //Create object for robot
	    Robot robot=new Robot();
	    robot.setAutoDelay(2000);
	    
	    //Get Screen dimension
	    Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
	    //Create screen with robot
	    BufferedImage Src_image=robot.createScreenCapture(new Rectangle(screen_size));
	    
	   //Dump image into local utilities
	   String Output_imagepath="C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\src\\robot_window_interface\\Robot.png";
	   ImageIO.write(Src_image, "PNG", new File(Output_imagepath));
	}

}
