package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Identify Object
		WebElement Sensex_TAB=driver.findElement(By.id("InvestRec"));
		Sensex_TAB.click();
		Thread.sleep(2000);
		
		//Retrieve Background color of object
		String Obj_BG_Color=Sensex_TAB.getCssValue("background-color");
		System.out.println("Object background color in RGBA format[RED,GREEN,BLUE,AlPHA] -->"+ Obj_BG_Color);
		
		if(Obj_BG_Color.equals("rgba(231, 120, 23, 1)"))
		{
			System.out.println("As expected Sensex tab selected");
		}
		else
		{
			System.out.println("Sensex tab selection failed, Object background is displayed -> "+Obj_BG_Color);
		}
		
		
		
		//Retrieve Font available at location
		String font_size=Sensex_TAB.getCssValue("font-size");
		System.out.println("Font size available is -> "+font_size);
		
		

	}

}
