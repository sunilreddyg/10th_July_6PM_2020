package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Type email
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com");
		//click Next button
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		Thread.sleep(5000); //Static timegap to load password element
		
		//Type password
		driver.findElement(By.name("password")).sendKeys("Hello123456");
		//Click Next button
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click();
		
		
	}

}
