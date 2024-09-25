package JavaMap;

import java.util.HashMap;


//import java.util.LinkedList;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.LinkedHashMap<String, String> linkedhashexample = new java.util.LinkedHashMap<String,String>();
		linkedhashexample.put("kows", "charu");
		linkedhashexample.put("viswa", "priya");
		linkedhashexample.put("swathi", "ka");
		linkedhashexample.put("mohan", "krishna");
	//	linkedhashexample.put("mohan", "krishna");
	//	linkedhashexample.put("mohana", "krishna");
		linkedhashexample.put(null, "myil");
		linkedhashexample.put(null, "kyil");
		linkedhashexample.put(null, null);
		System.out.println("linkedhashmap maintain insertaion:" +linkedhashexample);
		
		//For hashlinkedmap null values and duplicates are not allowed and it will overide the old one
		
		
		
		
		
		
		HashMap<String, String> linkedhashexamples = new HashMap<String,String>();
		linkedhashexamples.put("kows", "charu");
		linkedhashexamples.put("viswa", "priya");
	//	linkedhashexamples.put("swathi", "ka");
	//	linkedhashexamples.put("mohan", "krishna");
		//linkedhashexample.put("mohan", "krishna");
		linkedhashexample.put("mohan", "krishna");
		linkedhashexample.put(null, "myil");
	//	linkedhashexample.put(null, "kyil");
		System.out.println("hashmap do not maintain insertaion:" +linkedhashexamples);
		
		
		/*
		 * NOTE: the difference between hash map and linkedhashmap hash map doesn't
		 * follow the insertion order but linked hashmap maintain the insertion order
		 */
	}

}
