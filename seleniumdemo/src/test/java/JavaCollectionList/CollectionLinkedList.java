package JavaCollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		System.out.println("the lists are:" +linkedlist);
		//getting value from index
		System.out.println("the get index is:" +linkedlist.get(0));
		
		//getting the first value
		System.out.println("the first index adding:" +linkedlist.getFirst());
		
		//adding first and last
		linkedlist.addFirst(0);
		linkedlist.addLast(5);
		System.out.println("adding first and last:" +linkedlist);
		
		//remove first and remove last
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("removing first and last:" +linkedlist);
		
		//same as poll and remove are same
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist.pollFirst());
		System.out.println(linkedlist.pollLast());
		
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		
		System.out.println(linkedlist);
		
		
		System.out.println("******************************************************");
		
		/*
		 * Iteration of Linked List with simple for loop
		 */
		{
			
			LinkedList< String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			System.out.println("Simple For loop");
			for (int index=0;index<linkedList.size();index++){
				System.out.println("Elements in the LL are "+ linkedList.get(index));
			}
			System.out.println("-----------------------------------------------------");
		}
		
		
		/*
		 * Iteration of Linked List with Advanced For loop (For each)
		 */
		
		{
			LinkedList< String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			System.out.println("For Each");
			for (String string : linkedList) {
				System.out.println("Elements in the LL are "+ string);
			}
			System.out.println("-----------------------------------------------------");
		}
		
		
		/*
		 * Iterate using While
		 */
		{
			LinkedList< String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			int number=0;
			System.out.println("While");
			while(linkedList.size()>number){
				System.out.println("Elements in the LL are "+ linkedList.get(number));
				number++;
			}
			System.out.println("-----------------------------------------------------");
		}
		
		/*
		 * Iterate using Iterator
		 */
		{
			LinkedList< String> linkedList= new LinkedList<String>();
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			Iterator<String> iterator=linkedList.iterator();
			System.out.println("Iterator");
			while(iterator.hasNext()){
				System.out.println("Elements in the LL are "+ iterator.next());
			}
			System.out.println("-----------------------------------------------------");
		}
		
		

	
		
	}

}
