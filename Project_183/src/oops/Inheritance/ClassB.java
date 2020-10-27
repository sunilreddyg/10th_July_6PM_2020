package oops.Inheritance;

public class ClassB extends ClassA
{

	public void Test_ClassA()
	{
		System.out.println(name);  //Variable from parent class
		method1();    			   //Method from parent class
		
	}
	
	
	
	public static void main(String args[])
	{
		ClassB obj=new ClassB();
		obj.Test_ClassA();
		String x=obj.name;     //Variable from parent class
		obj.method1();         //Method from parent class
	}
}
