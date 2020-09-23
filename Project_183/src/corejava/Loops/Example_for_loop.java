package corejava.Loops;

public class Example_for_loop {

	public static void main(String[] args) 
	{
		
		
		
		//Print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
			
		}
		
		
		System.out.println("\n");  //This escape sequence create new line at console
		
		
		//print numbers 10 to 1
		for (int i = 10; i >= 1; i--) 
		{
			System.out.println(i);
		}
		
		
		System.out.println("\n");  //This escape sequence create new line at console
		
		
		//Runtime Single Dimensional array
		String tools[]= {"IDE","RC","WD","GRID","Appium","Cucumber","RestAPI"};
		//Iterate for expected number of tools
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		System.out.println("\n");  //This escape sequence create new line at console
		
		
		int sum=0;
		//Conduct sum between 1 to 100
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total sum value is ---> "+sum);
		
		
		//How to reverse a string
		String toolname="webdriver";
		
		char[] c=toolname.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) 
		{
			char ch=toolname.charAt(i);
			System.out.println(ch);
		}
		
		System.out.println("\n");
		
		
		
		
		

	}

}
