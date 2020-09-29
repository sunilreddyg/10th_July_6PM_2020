package corejava.Collections;

import java.util.HashMap;

public class HashMap_Interface {

	public static void main(String[] args) 
	{
		
		
		/*
		 *  => Hashmap store pair objects
		 */
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(100, "INDIA");
		map.put(201, "England");
		map.put(402, "Germany");
		map.put(502, "USA");
		
		
		String country=map.get(402);
		System.out.println(country);
		
		
		//get keys from map
		for (Integer i : map.keySet()) 
		{
			System.out.println(i);
		}
		
		
		//Get values from Map
		for (String Cntry : map.values()) 
		{
			System.out.println(Cntry);
		}
		
		
		//Using keyset retrieve all values
		for (Integer i : map.keySet()) {
			System.out.println(map.get(i));
		}
		
		
		
		
		
		

	}

}
