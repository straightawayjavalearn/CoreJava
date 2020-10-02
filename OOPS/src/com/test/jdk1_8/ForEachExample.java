package com.test.jdk1_8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		
		List<String> gamesList = new ArrayList<String>();
		
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
			
		System.out.println("using lamba expression and forEach()");
		gamesList.forEach(game -> System.out.println(game));
		
		System.out.println("using method refrences  and forEach()");
		gamesList.forEach(System.out::println);
		
	}
}