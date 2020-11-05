package framework.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
	
	  @BeforeClass //method invoke before execution of first @Test method with in class.
	  public void beforeClass() 
	  {
		  System.out.println("Class precondition");
	  }
	
	  @AfterClass //method invoke after execution of last @Test method with in class.
	  public void afterClass() 
	  {
		  System.out.println("Class postcondition");
	  }

	
	
	@Test
	public void tc001()
	{
		Reporter.log("Tc001 executed");
	}
	
	
	
	@Test
	public void tc002()
	{
		Reporter.log("Tc002 executed");
	}
	
	
	@Test
	public void tc003()
	{
		Reporter.log("Tc003 executed");
	}
	
	
 
	
}
