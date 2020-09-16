package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_Action {

	public static void main(String[] args) throws Exception 
	{
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//Performing right click on Element
		WebElement Button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		new Actions(driver).contextClick(Button).perform();
		Thread.sleep(4000);
		
		WebElement Delete_btn=driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[5]/span[1]"));
		Delete_btn.click();
		Thread.sleep(4000);
		
		//Close alert window
		driver.switchTo().alert().accept();

	}

}
