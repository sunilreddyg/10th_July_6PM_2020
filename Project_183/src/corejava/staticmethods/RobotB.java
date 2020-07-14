package corejava.staticmethods;

public class RobotB 
{
	//Static Specifier methods [Also known as class mehtods]
	static void method1()
	{
		System.out.println("method1 executed");
	}
	
	//Static Specifier methods [Also known as class mehtods]
	static void method2()
	{
		System.out.println("method2 executed");
	}
	

	public static void main(String[] args) 
	{
		/*
		 * In Main mehtod Static Access Spcifier allows any static 
		 * declared method directly without object Creation.
		 */
		
		//Calling Static Method with in class.
		method1();
		method2();
		
		//Calling Static Methods from different class
		RobotB.method1();
		RobotB.method2();
	}

}
