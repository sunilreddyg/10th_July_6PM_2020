package method_parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Run_Keywords 
{
	
	@FindBy(name="reg_email__") public static WebElement Mobile_or_email;

	public static void main(String[] args) throws Exception 
	{
		
		
		Keywords.launch_browser("chrome");
		Keywords.Launch_App("https://www.facebook.com/r.php");
		Keywords.set_timeout(50);
		
		Keywords.Type("//input[@name='firstname']", "Aakash");
		Thread.sleep(2000);
		
		By surname_locator=By.cssSelector("input[name='lastname']");
		Keywords.Type(surname_locator, "Vardhan");
		
		PageFactory.initElements(Keywords.driver, Run_Keywords.class);
		Keywords.Type(Mobile_or_email, "aakashvardhan@gmail.com");
		
		
		
		
		
	}

}
