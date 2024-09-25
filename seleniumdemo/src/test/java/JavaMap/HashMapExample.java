package JavaMap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashmapExample = new HashMap<Integer,String>();
		//To insert a element put method is used 
		hashmapExample.put(1, "kows");
		hashmapExample.put(2, "charu");
		hashmapExample.put(3, "mathi");
		hashmapExample.put(4, "viswa");
		hashmapExample.put(5, "priya");
		
		System.out.println(hashmapExample);
		
		//to make a copy of exisiting values
		HashMap<Integer, String> duplicatemap = new HashMap<Integer,String>();
		duplicatemap.putAll(hashmapExample);
		System.out.println("Duplicate map:" +duplicatemap);
		
		//clear
		duplicatemap.clear();
		System.out.println("clear method:" +duplicatemap);
		
		//To check if the key is present or not in the map    //boolentype
		//it returns false because i give duplicatemethod it has empty list
		System.out.println("Does this map has key 3:" +duplicatemap.containsKey(2));
		
		//To check if the key is present or not in the map     //boolentype
		System.out.println("Does the map has value charu:" +hashmapExample.containsValue("charu"));
		
		//clone the map as same as copy of the map
		System.out.println("clone map:" +hashmapExample.clone());
		
		//check the map set is empty or not
		System.out.println("check empty?:" +hashmapExample.isEmpty());
		System.out.println("check empty duplicate method:" +hashmapExample.isEmpty());
		
		//all kwt set
		System.out.println("only key value:" +hashmapExample.keySet());
		
		//get method
		System.out.println("giving key and taking value:" +hashmapExample.get(3));
		
		//entry set
		System.out.println("entry set:" +hashmapExample.entrySet());

//key and value is called entry set -----interview questuion

	}

}
