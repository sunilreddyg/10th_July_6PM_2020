package launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome_browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		/*
		 * Note:--> Before launch chrome browser download a
		 * 			chromdriver.exe file and set as environment
		 * 			variable.
		 * 
		 * 			=> Visit site https://chromedriver.chromium.org/downloads
		 * 			=> W.r.t chrome browser version click on chromedriver link.
		 * 			=> At index page click Select OS. For windows download zip format file
		 * 			=> Unzip file, After unzip you receive chromedriver.exe file
		 * 			=> Copy Chromedriver.exe file under project folder
		 * 			=> Set Runtime Environment variable before launch chrome browser
		 * 			
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();     //launch browser
		chrome.get("http://google.com");            //load webpage
		
		Thread.sleep(5000);  //Static time wait for 5 seconds
		
		chrome.close();
		
		
		

	}

}
