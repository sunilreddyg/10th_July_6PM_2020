package method_parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords 
{
	
	
	static WebDriver driver;
	static WebDriverWait wait;
	static String Driver_path="browser_drivers\\";
	
	
	/*
	 * Keyword:-->  Launching Browser  [Chrome, Firefox, IE]
	 * Description:-->  Method launch above browsers by taking input from user..
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", Driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser name mismatch");
			break;
		}
	}
	
	
	
	/*
	 * Keyword:-->   	Open_App  
	 * Description:-->  Method enter site url at browser window.
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void Launch_App(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword:-->   	Set timeout for Implicit and Explicit
	 * Description:-->  Method enter site url at browser window.
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void set_timeout(int time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * Keyword:-->   	Enter_text
	 * Description:-->  Method type input text into editbox   [Note:--> This method only usefull to identify objects with xpath]
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void  Type(String Element_xpath, String Inputdata)
	{
		driver.findElement(By.xpath(Element_xpath)).clear();
		driver.findElement(By.xpath(Element_xpath)).sendKeys(Inputdata);
		
	}
	
	
	
	/*
	 * Keyword:-->   	Type text into editbox
	 * Description:-->  Method type input text into editbox   [Note:--> This method usefull for pageobject model]
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void  Type(By Locator, String Inputdata)
	{
		driver.findElement(Locator).clear();
		driver.findElement(Locator).sendKeys(Inputdata);
		
	}
	
	
	
	/*
	 * Keyword:-->   	Type text into editbox
	 * Description:-->  Method type input text into editbox   [Note:--> This method usefull for pageobject model]
	 * Create On:-->
	 * ReviewedBy:-->
	 * Author:-->
	 * Parameters Used:-->   Local parameter
	 */
	public static void  Type(WebElement element, String Inputdata)
	{
		
		WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
		Element.clear();
		Element.sendKeys(Inputdata);
		
	}
	
	

}
