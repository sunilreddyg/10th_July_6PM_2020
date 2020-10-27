package oops.Inheritance;

public class ClassC extends ClassB
{
	
	public void Test()
	{
		System.out.println(name);   //From parent classA
		method1();					//From Parent classA
		Test_ClassA();				//From Parent classB
	}
	
	public static void main(String args[])
	{
		new ClassC().Test();
	}
}
