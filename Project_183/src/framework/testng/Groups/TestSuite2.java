package framework.testng.Groups;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite2 
{
 

	  @Test
	  public void tc004() 
	  {
		 Assert.assertTrue(true);
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test(groups="G1")
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test
	  public void tc006() 
	  {
		  Reporter.log("Tc006 executed",true);
	  }
	  
	  
	
}
