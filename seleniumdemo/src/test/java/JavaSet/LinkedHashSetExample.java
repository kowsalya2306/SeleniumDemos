package JavaSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	/**
	 * LinkedHashSet->Child class of HashSet
	 * DS-> Hash table + Linked List
	 * Insertion order is preserved (important) this is the difference between ash set and linked hash set
	 * Duplicates not allowed
	 */

	public void linkedHashSetExample(){
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("10");

		System.out.println("Insertion Order preserved Linked Hash Set :"+ linkedHashSet);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSetExample example= new LinkedHashSetExample();
		example.linkedHashSetExample();
	}

}