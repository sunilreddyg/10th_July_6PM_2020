package mq.dsnr.advjava;

public class SampleTest 
{
	
	void method1()
	{
		System.out.println("metho1 executed");
	}
	
	void method2()
	{
		System.out.println("method2 executed");
	}
	
	
	public static void main(String args[])
	{
		new SampleTest().method1();
		new SampleTest().method2();
	}
	

}
