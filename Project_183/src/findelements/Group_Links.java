package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		
		//Identitying footer links
		WebElement Footer_links=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		//Identifying links under Footer_links area.
		List<WebElement> All_links=Footer_links.findElements(By.cssSelector("a[rel='nofollow']"));
		System.out.println("List of links available under footer links --> "+All_links.size());
		
		
		//Iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			//Get Each link using index number
			WebElement Eachlink=All_links.get(i);
			
			String Linkname=Eachlink.getText();
			String LInkhref=Eachlink.getAttribute("href");
			System.out.println(Linkname+"       "+LInkhref);
			
			//Click Eachlink
			Eachlink.click();   //If page changes your references will be empty and your recieve "StateElementReference Exception"
			Thread.sleep(2000);
			
			//Navigate back to mainpage
			driver.navigate().back();
			
			
			//Restore References to avoid StateElement Reference exception
			Footer_links=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			All_links=Footer_links.findElements(By.cssSelector("a[rel='nofollow']"));
			
		}

	}

}
