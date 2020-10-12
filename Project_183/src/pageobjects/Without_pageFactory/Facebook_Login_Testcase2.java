package pageobjects.Without_pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Testcase2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Valid Account
		driver.findElement(FB_LoginPage.Email).sendKeys("qadarshan@gmail.com");
		driver.findElement(FB_LoginPage.password).sendKeys("680806sunil");
		driver.findElement(FB_LoginPage.Login_btn).click();
		
	}

}
