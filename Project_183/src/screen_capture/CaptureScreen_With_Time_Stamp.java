package screen_capture;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_Time_Stamp 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		//Get Current system time
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Using simpledateformatter convert date
		String time=sdf.format(d);
		
		
		File srfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srfile, 
		new File("C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\screens\\"+time+"image.png"));
		
		

	}

}
