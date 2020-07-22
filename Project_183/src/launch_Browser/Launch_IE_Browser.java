package launch_Browser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*
		 * Note:--> Before launch IE browser download a
		 * 			IEDriverServer.exe file and set as environment
		 * 			variable.
		 * 
		 * 		=> visit site https://www.selenium.dev/downloads/
		 * 		=> Find "The internet explorer driver" 
		 * 		=> download file w.r.t hotspot size.
		 *      => Unzip file to project folder
		 *      => Set runtime environment before launch ie browser
		 * 
		 * 
		 */
		
		
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://facebook.com");

		Thread.sleep(5000);   //Static timeout 5 seconds
		
		ie.close();

	}

}
