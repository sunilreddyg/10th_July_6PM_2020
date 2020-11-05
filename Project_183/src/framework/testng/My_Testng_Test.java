package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My_Testng_Test 
{
	  @Test   //Organize method to run without object creation
	  public void tc001()
	  {
		  Reporter.log("Tc001 Executed");
	  }
	  
	  @Test   //Organize method to run without object creation
	  public void tc002()
	  {
		  Reporter.log("Tc002 Executed");
	  }
	  
	  
	  @Test   //Organize method to run without object creation
	  public void tc003()
	  {
		  Reporter.log("Tc003 Executed");
	  }
	  
}
 