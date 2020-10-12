package pageobjects.Without_pageFactory;

import org.openqa.selenium.By;

public class FB_LoginPage 
{
	
	/*
	 * public:--> Public is a modifier it allows variable to use across packages
	 * Static:--> Static is a specifier it specifies variable can be accessed without object creation
	 */
	
	public static By Email=By.id("email");
	public static By password=By.id("password");
	public static By Login_btn=By.xpath("//button[@data-testid='royal_login_button']");
	

}
