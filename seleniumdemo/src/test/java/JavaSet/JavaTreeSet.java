package JavaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSet {
	

	/**
	 * TreeSet is the implementation class of SortedSet Interface.
	 * Does not allow duplicates.
	 * Sorts the elements
	 * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
	 * Difference between Hashset and Treeset, hash doesnt maintain order
	 * but Treeset maintains ascending or alphabetical order.
	 * DS-> Balanced Tree
	 * Heterogeneous data not allowed. If added Exception, ClassCast will occur
	 * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	 * To say any class is comporable or not, the class should implement comparable interface.
	 */
	/*
	 * Constructors present are 4
	 * 1. TreeSet ts= new TreeSet();// default sort order
	 * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
	 * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
	 * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();   //object create
		treeset.add(20);
		treeset.add(11);
		treeset.add(15);
		treeset.add(25);
		treeset.add(30);
		System.out.println(treeset);
		
		System.out.println("firse element:" +treeset.first());     //first
		
		System.out.println("last element:" +treeset.last() );      //last
		
		//headset  head set doesn't include the starting value
		
		System.out.println("values less than: " +treeset.headSet(20));
		
		//tailset     tailset include the last vale
		System.out.println("values equal to and higher than the value:" +treeset.tailSet(20));
		
		//subset
		System.out.println(treeset.subSet(11, 20));    //it will take first value not last
		
		//comparator
		System.out.println("Comparator returns null if the sorting is default natural order :"+treeset.comparator());
		//higher
		System.out.println("the next higher value:" +treeset.higher(20));
		//lower
		System.out.println("the previous lower value:" +treeset.lower(20));
		//pollfirst
		System.out.println("retrive and delete the first value:" +treeset.pollFirst());
		
		//polllast
		System.out.println("retrive and delete the last value:" +treeset.pollLast());
		
		//descending list
		System.out.println("Descending order list:" +treeset.descendingSet());
		
		/*null can be easily added if the tree set is empty. If there are any elements present, the
		 * comparator will check for the sorting order between the previosly added element and 
		 * the null. Since it compares null with the objects exisiting we are getting NPE.
		 * Same is the case, if we add null first and add other elements, NPE will happen.
		 */
		
		//normal iteration
		Iterator<Integer> iteration = treeset.iterator();
		while(iteration.hasNext()) {
		System.out.println(iteration.next());
		
		Iterator<Integer> descIterator = treeset.descendingIterator();
		while(descIterator.hasNext()) {
			System.out.println("descending order:" +descIterator.next());
		}
	
	}

	}}
