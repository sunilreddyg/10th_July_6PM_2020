package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Identify Object
		WebElement Sensex_TAB=driver.findElement(By.id("InvestRec"));
		Sensex_TAB.click();
		Thread.sleep(2000);
		
		
		//Get Object height and width
		int Obj_Height=Sensex_TAB.getSize().getHeight();
		int Obj_width=Sensex_TAB.getSize().getWidth();
		
		System.out.println("Object Height is -> "+Obj_Height);
		System.out.println("Object Width is --> "+Obj_width);
		
		
		//How to verify object visible using Height and Width
		if(Obj_Height > 0)
		{
			System.out.println("Object is visible at webpage");
		}
		else
		{
			System.out.println("Object hiddent at webpage");
		}
		
		
		

	}

}
