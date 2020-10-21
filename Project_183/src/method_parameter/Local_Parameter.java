package method_parameter;

public class Local_Parameter 
{
	//Method without parameter
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println("tool name is ---> "+name);
	}
	
	
	//Method with functional parameter
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println("=> "+name);
	}
	
	//Method with multiple functional parameter
	public void print_tool(String toolname, double price)
	{
		System.out.println(toolname+"   --> "+price);
	}
	
	
	public void print_tool(double price, String toolname)
	{
		System.out.println(price+"   --> "+toolname);
	}
	
	

	public static void main(String[] args) 
	{
		
		//Create object for class, Inorder to call instant method
		Local_Parameter obj=new Local_Parameter();
		obj.print_tool();
		
		//Calling method with actual parameter
		obj.print_tool("LoadRunner");
		obj.print_tool("Jmeter");
		obj.print_tool("PostMan");
		obj.print_tool("Appium");
		obj.print_tool("Cucumber");
		
		//Calling method with actual parameters
		obj.print_tool("IDE", 1500.00);
		obj.print_tool("WebDriver", 10000.00);
		

	}

}
