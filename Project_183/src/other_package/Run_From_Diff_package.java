package other_package;

import corejava.instantmethods.RobotA;
import corejava.staticmethods.RobotB;

public class Run_From_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to call other package methods and variables
		 * 			we should follow below instructions.
		 * 
		 * 		1. import other package referrece into Current Class.
		 * 		2. Only public modifier methods allowed to call from
		 * 				different package.
		 * 
		 * 
		 * 		import packagename.classname;
		 * 		import packagename.*;
		 */
		
		//Calling Instant method
		new RobotA().run();
		
		//Static method calling
		RobotB.method1();
		RobotB.method2();
		
		

	}

}
