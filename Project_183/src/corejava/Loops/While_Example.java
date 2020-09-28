package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		//While loop with false condition
		int j=10;
		while(j > 100)   //False Condition
		{
			System.out.println("This Statement doesn't execute");
		}
		
		
		
		
		//print number from 1 to 10
		int i=1;
		while(i<=10)     //True Condition
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		
		//Example:--> Using while loop manage explicit wait.
		
		System.setProperty("webdriver.chrome.driver",  "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		int k=0;
		while(!Retype_Email.isDisplayed()) //!--NOT
		{
			System.out.println("Trying to find element visibility");
			Thread.sleep(1000);
			
			k=k+1;
			if(k==30)
			{
				throw new Exception("Testfail, Expected Element not visible after checking 30 max seconds");
			}
		}
		
		
		System.out.println("Element visible at webpage");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
