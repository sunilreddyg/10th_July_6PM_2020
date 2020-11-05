package framework.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_method_after_method 
{

	  @BeforeMethod //Invoke before every @Test annotation
	  public void beforeMethod() 
	  {
		  System.out.println("Test method precondition");
	  }
	
	  @AfterMethod //Invoke after every @Test annotation
	  public void afterMethod() 
	  {
		  System.out.println("Test method post condition"+"\n");
	  }
  
  	@Test
	public void tc001()
	{
		Reporter.log("Tc001 executed",true);
	}
	
	
	
	@Test
	public void tc002()
	{
		Reporter.log("Tc002 executed",true);
	}
	
	
	@Test
	public void tc003()
	{
		Reporter.log("Tc003 executed",true);
	}

}
