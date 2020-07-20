package corejava.instantmethods;

public class RobotA 
{
	//Class Constructor
	public RobotA()
	{
		System.out.println("Robot is Active");
	}
	
	//Instant method   [Because this method have access modifier it can access outside package]
	public void run()
	{
		System.out.println("run executed");
	}
	
	//Instant Method [Because this method don't have access modifier it only accessable wit in package]
	void walk()
	{
		System.out.println("Walk executed");
	}
	

	public static void main(String[] args) 
	{
		new RobotA();   //Calling Constructor of class
		
		//Calling Instant methods [Instant methods not contains static Access specifier]
		new RobotA().run();
		new RobotA().walk();
		
		/*
		 * Object Creation with Variable
		 *     ClassName obj=new ClassName();
		 *     obj.methodname();
		 */
		RobotA obj=new RobotA();
		obj.walk();
		obj.run();
	
	}
	
	
	
	

}
