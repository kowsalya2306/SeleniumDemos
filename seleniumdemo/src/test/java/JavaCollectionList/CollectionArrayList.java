package JavaCollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arraylist = new ArrayList<String>(); // dynamic method we can see in polymorphism
		arraylist.add("kows");
		arraylist.add("charu"); // add method
		arraylist.add("mathi");
		arraylist.add("priya");
		arraylist.add("swathika");
		arraylist.add("null");
		System.out.println("charu");

		System.out.println(arraylist);

		System.out.println(arraylist.get(0)); // get method

		System.out.println(arraylist.indexOf("charus")); // first index method

		System.out.println(arraylist.lastIndexOf("charu")); // last index method

		List<String> anotherlist = new ArrayList<String>(); // created another list

		anotherlist.addAll(arraylist); // add it to the new list

		System.out.println(anotherlist);

		anotherlist.clear(); // clear method
		System.out.println(anotherlist);

		arraylist.set(2, "viswa"); 
	    System.out.println(arraylist);
	    
	    System.out.println(arraylist.isEmpty());                          //isempty method
	    
	    
	                                           //Types for iteration
	    // for iteration we use for each loop and for loop
	    
	    //for each
	    for (String string : arraylist) {
			System.out.println("using for each:" +string);
		}
	    //for loop
	   for(int i=0;i<arraylist.size();i++) {
		   System.out.println("using for loop:" +arraylist.get(i));
	   }
	   
	   System.out.println("*************************************************");
		  ListIterator<String> iterator = arraylist.listIterator();               //Iterator has forward and back 
		  
         while(iterator.hasNext()) {
        	 System.out.println(iterator.next());
		}
         
         while(iterator.hasPrevious()) {
        	 System.out.println(iterator.previous());
		}
         
		 System.out.println("*******************************");
        
		 Iterator<String> iterators = arraylist.iterator();       //only forward direction in iterator
		 while(iterators.hasNext()) {
			 System.out.println(iterators.next());
		 }
	}

}
