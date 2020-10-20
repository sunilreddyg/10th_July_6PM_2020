package pageobjects.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CT_HOME
{
	
	public CT_HOME(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='/flights'])[2]") 
	public WebElement Flights;
	
	@FindBy(xpath = "(//a[@href='/hotels'])[2]") 
	public WebElement Hotels;
	
	@FindBy(xpath = "//a[@title='Find trains to destinations within India']") 
	public WebElement Trains;

}
