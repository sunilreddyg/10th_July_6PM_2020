package ui_VerificationCommands;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

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
		
		
		//Get OBject Point
		int Obj_x=Sensex_TAB.getLocation().getX();
		int Obj_y=Sensex_TAB.getLocation().getY();
		
		System.out.println("obj X coordinates are --> "+Obj_x);
		System.out.println("obj y coordinates are --> "+Obj_y);
		
		
		//How to verify object visible at webpage  using coordinates
		if(Obj_x > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object not visible at webpage");
		
		
		
		
		
		

	}

}
