package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Dropby {

	public static void main(String[] args) throws Exception {
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//DragAndDropby using x and y coordinates
		WebElement Scroller=driver.findElement(By.xpath("//div[@class='range-wrapper rupees-present tooltip-hide']//div[@class='rangeslider__handle']"));
		new Actions(driver).dragAndDropBy(Scroller, 200, 0).perform();
		
		
		
		
		
		
		

	}

}
