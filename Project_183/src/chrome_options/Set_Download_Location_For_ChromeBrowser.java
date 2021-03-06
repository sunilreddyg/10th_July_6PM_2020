package chrome_options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Download_Location_For_ChromeBrowser {

	public static void main(String[] args)
	{
		
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\screens\\");
		
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		System.out.println("Site is up and ready to use..");
		

	}

}
