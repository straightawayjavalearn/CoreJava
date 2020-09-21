package com.test.collectionframework;

import java.util.*;

public class TestJavaCollection7 {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("abc");
		set.add("xyz");
		set.add("pqr");
		set.add("nrm");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}