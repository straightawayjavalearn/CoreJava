package com.test.collectionframework;

import java.util.HashMap;
import java.util.Map;

class MapExample2 {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(null, "pp");
		
		System.out.println("hashcode is "+map.hashCode());
		System.out.println(2657860 & 15);
		// Elements can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}