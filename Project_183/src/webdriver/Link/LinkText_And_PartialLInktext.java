package webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_PartialLInktext {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Clicking link with original linkname
		driver.findElement(By.linkText("Hotels")).click();
		
		//Clicking link with original linkname
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(5000);
		
		//Clicking link with original linkname
		driver.findElement(By.linkText("Jobs")).click();
		
		//Clicking link with partial linkname
		driver.findElement(By.partialLinkText("Openings")).click();
		
		//CLicking link with partial linkname
		driver.findElement(By.partialLinkText("Product Designer")).click();
		
		
		
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("TRACKER")).click();
		
		
		
	}

}
