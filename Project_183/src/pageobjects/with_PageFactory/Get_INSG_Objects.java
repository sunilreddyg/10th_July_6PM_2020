package pageobjects.with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Get_INSG_Objects 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Inorder to get @FindBy annotated method in different class we must follow
		 * Pagefactory initElement Method.
		 */
		INSG_Signup signup=PageFactory.initElements(driver, INSG_Signup.class);
		
		signup.Email_or_Phone.clear();
		signup.Email_or_Phone.sendKeys("info.bridgeq@bridgeqsystems.com");
		
		signup.FullName.clear();
		signup.FullName.sendKeys("BridgeQ");
		
		signup.Username.clear();
		signup.Username.sendKeys("Sunilreddy.g");
		
		signup.password.clear();
		signup.password.sendKeys("Hello1234");
		
		

	}

}
