package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description {


	
	@Test(description="Verifyting login with valid data")
	public void tc001()
	{
		Reporter.log("Login test executed");
	}

}
