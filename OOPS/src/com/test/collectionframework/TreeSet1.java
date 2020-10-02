package com.test.collectionframework;

import java.util.*;

class TreeSet1 {
	public static void main(String args[]) {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add( "Ravi" );
		set.add( "Vijay" );
		set.add( "Ajay" );
		System.out.println( "Traversing element through Iterator in descending order" );
		Iterator i=set.descendingIterator();
		// Traversing elements
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
