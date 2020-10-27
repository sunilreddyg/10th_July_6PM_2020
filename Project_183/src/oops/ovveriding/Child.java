package oops.ovveriding;

public class Child extends Parent
{
	
	
	public void m1()
	{
		System.out.println("m1 from child class");
	}
	
	
	public void m2()
	{
		super.m1();   //Calling from parent class
		System.out.println("m2 from child class");
	}
	
	


}
