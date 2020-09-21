package com.test.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

class TestJavaCollection1 {
	
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		
		list.add("abc"); // Adding object in arraylist
		list.add("xyz");
		list.add("pqr");
		list.add("nrm");
		list.add("nrm");
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}