package pageobjects.Without_pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Testcases1 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Testcase:--> Login Invalid
		driver.findElement(FB_LoginPage.Email).sendKeys("9030248855");
		driver.findElement(FB_LoginPage.password).sendKeys("Hello12345");
		driver.findElement(FB_LoginPage.Login_btn).click();
		
		
		
		
		
	}

}
