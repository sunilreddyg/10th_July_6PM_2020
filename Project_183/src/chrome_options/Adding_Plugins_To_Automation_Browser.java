package chrome_options;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adding_Plugins_To_Automation_Browser {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\katalon_recorder.crx"));
		//Adding truepath extension for chrome browser.
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://facebook.com");
		System.out.println("Site is up and ready to use..");

	}

}
