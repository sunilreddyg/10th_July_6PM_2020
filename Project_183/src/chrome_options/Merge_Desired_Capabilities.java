package chrome_options;

import java.io.File;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Merge_Desired_Capabilities {

	public static void main(String[] args) 
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\katalon_recorder.crx"));
		
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		
	
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(caps);
		driver.get("http://facebook.com");
		System.out.println("Site is up and ready to use..");

		
		
		
		
	}

}
