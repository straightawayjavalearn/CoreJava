package com.test.collectionframework;

import java.util.*;

public class TestJavaCollection2 {
	public static void main(String args[]) {
		
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("abc");
		al.add("xyz");
		al.add("pqr");
		al.add("nrm");
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}