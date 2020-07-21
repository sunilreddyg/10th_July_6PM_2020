package launch_Browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FIrefox 
{
	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Note:--> Before launch firefox browser download a
		 * 			geckodriver.exe file and set as environment
		 * 			variable.
		 * 
		 * 		=> Visit site  https://github.com/mozilla/geckodriver/releases
		 * 		=> W.r.t browser version download chromedriver file
		 * 		=>  Firefox Version 60>=  geckodriver version =v0.26.0
		 * 		=> Select Operating system and downlaod file
		 * 		=> unzip file to project folder
		 * 		=> set environment variable before launch firefox browser
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();   //Launch Browser
		firefox.get("http://facebook.com");
		
		Thread.sleep(5000);  //Static timeout 5 seconds
		
		firefox.close();

	}

}
