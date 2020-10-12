package pageobjects.with_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class INSG_Signup 
{
	
	//@Findby annotation lookup for object at webpage
	@FindBy(name="emailOrPhone") 
	public WebElement Email_or_Phone;
	
    @FindBy(xpath="//input[@aria-label='Full Name']") 
    public WebElement FullName;
    
    @FindBy(xpath = "//input[contains(@maxlength,'30')]")
    public WebElement Username;
    
    //Old format to lookup for object
    @FindBy(how=How.CSS,using="input[name='password']")
    public WebElement password;
    
    @FindBy(xpath = "(//div[contains(.,'Sign up')])[7]")
    public WebElement Signup_btn;
   

}
