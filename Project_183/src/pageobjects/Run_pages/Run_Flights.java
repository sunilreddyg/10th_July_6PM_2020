package pageobjects.Run_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Pages.CT_Flights;
import pageobjects.Pages.CT_HOME;

public class Run_Flights {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		
		CT_HOME homepage=new CT_HOME(driver);
		homepage.Flights.click();
		
		
		CT_Flights flights=new CT_Flights(driver);
		flights.Roundtrip_Rbtn.click();
		
		flights.From_City_AEB.clear();
		flights.From_City_AEB.sendKeys("HYD");
		flights.Flights_HYD_City.click();
		
		
		
		
		

	}

}
