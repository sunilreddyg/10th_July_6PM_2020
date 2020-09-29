package corejava.Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) 
	{
		Set<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		set.add("five");
		set.add("six");
		set.add("seven");
		
		//Get total object count
		int obj_count=set.size();
		System.out.println("Object Count is --> "+obj_count);
		
		//At runtime remove single object from collection
		set.remove("four");
		
		//At Runtime verify object contains at collection
		boolean flag=set.contains("five");
		System.out.println("Object available at collection is -> "+flag);
		
		
		//Get First iterator value from collection.
		String itr=set.iterator().next();
		System.out.println("next iterator value from collection --> "+itr);
		
		
		//Clear all object at runtime
		//set.clear();
		
		//Verify Collection empty status
		boolean flag1=set.isEmpty();
		System.out.println("Is Collection Empty? --> "+flag1);
		
		
		
		//Using Foreach loop read collection of objects
		for (String Eachobj : set) 
		{
			System.out.println("=>"+ Eachobj);
		}
		
		
		//Using while loop read collection of objects
		Iterator<String> it=set.iterator();
		
		//Condition loop to read until iterator has next value
		while(it.hasNext())
		{
			String next_obj=it.next();
			System.out.println("#->"+next_obj);
		}
		

	}

}
