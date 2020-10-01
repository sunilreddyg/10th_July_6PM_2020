package findelements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links 
{
	
	
	public static void main(String[] args) 
	{
		
		/*
		 * Find page response timeout unde below link
		 * https://www.w3.org/Protocols/HTTP/HTRESP.html
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     	 	
		driver.get("http://cleartrip.com");			  
		driver.manage().window().maximize();
		
		
		//identifying location of footerlinks
		WebElement Footer_Area=driver.findElement(By.cssSelector(".inline.clearFix"));
		//Get list of links under footer area..
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		
		
		boolean isValid=false;
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			
			//Get Each link using index number
			WebElement Eachlink=Footer_links.get(i);
			//Retieve href of each link
			String LInkhref=Eachlink.getAttribute("href");
			
			//Get ResponseCode using page url
			isValid=getResponseCode(LInkhref);
			
			if(isValid==true)
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
			 else
			 {
				 System.out.println(Eachlink.getText()+"   "+isValid+"\n");
			 }
			
		}
		
		
		

	}
	
	public static boolean getResponseCode(String urlString) 
	{
        boolean isValid = false;
        try {
            URL u = new URL(urlString);
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            h.connect();
            System.out.println(h.getResponseCode());
            if (h.getResponseCode() != 404) {
                isValid = true;
            }
        } catch (Exception e) {

        }
        return isValid;
    }

}
