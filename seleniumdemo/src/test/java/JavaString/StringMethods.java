package JavaString;

import java.util.Iterator;

public class StringMethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String name ="kowsalya";
		  int number = 5;
		
		//returns character value for the particular index
		System.out.println(name.charAt(1));
		
		//returns string length
		System.out.println(name.length());
		
		//checks the equality of string with the given object.
	    System.out.println(name.equals("kowsalya"));
	    
	    //checks the equality of string with the given object without case sensitivity
	    System.out.println(name.equalsIgnoreCase("KOWSAlya"));
	    
	    //checks if string is empty or not
	    System.out.println(name.isEmpty());
	    
	    //returns true or false based on the given value is present
	    System.out.println(name.contains("A"));
	    
	    //take a particular portion of the string
	    System.out.println(name.substring(1));
		
		//take a particular portion of the string begin and end index
	    System.out.println(name.substring(1, 3));

	    //appends the string to the given string
	    System.out.println(name.concat("charumathi"));
	    
	    //replace the existing char with given char
	    System.out.println(name.replace("k", "K"));
	    System.out.println(name.replace("kowsalya", "KOWS"));
	    
	    //find the position of a character in the string
	    System.out.println(name.indexOf("0"));
	    
	    //finds the character specified from the index position
	    System.out.println(name.indexOf("a",6));
	    
	    //finds the character specified from the index position
	    System.out.println(name.indexOf('i',2));
	    
	    //trim will remove the white spaces before and after
	    System.out.println(name.trim());
	    
	    //conert the given type to string
	    System.out.println(String.valueOf(number));
	    
	    String uppercase="CHARUMATHI";
	    System.out.println(uppercase.toLowerCase());
	    
	    String lowercase ="charumathi";
	    System.out.println(lowercase.toUpperCase());
	    
	    //returns a joined string with given delimiter
	    System.out.println(String.join("-", "Learn","Automation","Online"));
	    
	    //split
	    String splitThis = "Am,I,teaching,good";
	    String [] splittedwords = splitThis.split(",");
	    for (String string : splittedwords) {
			System.out.println(string);
		}
			
		}
	    
	}

