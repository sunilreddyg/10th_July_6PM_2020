package corejava.Loops;

public class Foreach_Example {

	public static void main(String[] args) {
		
		
		//Runtime Single Dimensional array..
		String tools[]= {"IDE","RC","WD","GRID","Appium","Cucumber","RestAPI"};
		//Apply foreach loop to iterate all array values
		for (String Eachtool : tools) 
		{
			System.out.println(Eachtool);
		}
		
		
		
		//Runtime Single dimensional array
		int num[]= {100,200,300,400,500,600};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		

	}

}
