package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Elementto_Target {

	public static void main(String[] args) {
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		WebElement Trash_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		//Drag source location to target
		new Actions(driver).dragAndDrop(Doc1, Trash_Bin).perform();
		new Actions(driver).dragAndDrop(Doc2, Trash_Bin).perform();
		
		//Using mouse actions perform drag and drop
		new Actions(driver).clickAndHold(Doc3).moveToElement(Trash_Bin).release().perform();
		new Actions(driver).clickAndHold(Doc4).moveToElement(Trash_Bin).release().perform();
	}

}
