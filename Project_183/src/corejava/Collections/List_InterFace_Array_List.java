package corejava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_InterFace_Array_List {

	public static void main(String[] args) 
	{
		
		/*
		 * => Inorder collection of objects
		 * => List accept duplicates
		 */
		
		
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		
		
		//Because list interface contain order, we can retrieve any single object using index number
		String obj=list.get(3);
		System.out.println("3rd index object at list is --> "+obj);
		
		
		//Get total object count
		int obj_count=list.size();
		System.out.println("Object Count is --> "+obj_count);
		
		//At runtime remove single object from collection
		list.remove("four");
		
		//At Runtime verify object contains at collection
		boolean flag=list.contains("five");
		System.out.println("Object available at collection is -> "+flag);
		
		
		//Get First iterator value from collection.
		String itr=list.iterator().next();
		System.out.println("next iterator value from collection --> "+itr);
		
		
		//Clear all object at runtime
		//list.clear();
		
		//Verify Collection empty status
		boolean flag1=list.isEmpty();
		System.out.println("Is Collection Empty? --> "+flag1);
		
		
		
		//Read all Collection of objects using forloop
		for (int i = 0; i < list.size(); i++) 
		{
			String for_obj=list.get(i);
			System.out.println(for_obj);
		}
		
		
		
		//Using Foreach loop read collection of objects
		for (String Eachobj : list) 
		{
			System.out.println("=>"+ Eachobj);
		}
		
		
		//Using while loop read collection of objects
		Iterator<String> it=list.iterator();
		
		//Condition loop to read until iterator has next value
		while(it.hasNext())
		{
			String next_obj=it.next();
			System.out.println("#->"+next_obj);
		}
		

	}

}
