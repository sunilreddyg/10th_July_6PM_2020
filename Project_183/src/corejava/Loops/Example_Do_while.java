package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Do_while {

	public static void main(String[] args) throws Exception 
	{
		
		
		int i=0;
		while(i>10)       //False condition
		{
			System.out.println("I skipped");
			i=i+1;
		}
		
		
		
		int j=0;
		do {
			
			System.out.println("I Executed");
			j=j+1;
			
		} while (j >10);   //False condition
		
		
		
		//Do-while with true condition
		int k=0;
		do {
			System.out.println(k);
			k=k+1;
		} while (k <=10);  //True Condition
		
		
		
		/*
		 * Example:--> Using do-while write a program to reload page
		 * 				until expected page found..
		 */
		System.setProperty("webdriver.chrome.driver",  "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		boolean flag;
		int m=0;
		do {
			
			driver.get("http://google.com");
			Thread.sleep(5000);
			//Capture current window title
			String Runtime_title=driver.getTitle();
			flag=Runtime_title.contains("Facebook – log in or sign up");
			System.out.println("Title status return ---> "+flag);
			Thread.sleep(10000);
			
			m=m+1;
			if(m==20)
			{
				throw new Exception("After 20 attemps suspending loop");
			}
			
		} while (!flag==true);
		
		
		
		System.out.println("Expected title presented");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
