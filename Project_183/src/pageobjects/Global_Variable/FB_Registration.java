package pageobjects.Global_Variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Registration 
{
	WebDriver driver;
	
	public FB_Registration(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement Firstname;
	
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Surname;
	
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement mobile_number;
	

	
	
	/*
	 * Reusable Method:--> Registration
	 */
	public void User_Registration()
	{
		Firstname.clear();
		Firstname.sendKeys("Newuser");
		
		Surname.clear();
		Surname.sendKeys("Webdriver");
		
		mobile_number.clear();
		mobile_number.sendKeys("newuserwebdriver@gmail.com");
		
		
		String InputValue=Firstname.getAttribute("value");
		System.out.println("Input value at Firstname editbox is ---> "+InputValue);
		
	}
	
	
	
	public void close_browser()
	{
		try {
			
			Thread.sleep(5000);
			driver.close();
			
		} catch (Exception e) {
			
		}
	}

}
