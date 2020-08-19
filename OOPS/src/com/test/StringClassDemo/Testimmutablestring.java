package com.test.StringClassDemo;

class Testimmutablestring {
	public static void main(String args[]) {
	    String s1;
		String s = "Sachin"; 
		s1=s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);
		System.out.println(s1);// will print Sachin because strings are immutable objects (here two objects
								// created)
	}
}



// s=s.concat(" Tendulkar")

/*
 * 
 * Because java uses the concept of string literal.Suppose there are 5 reference variables,
 * all referes to one object "sachin".If one reference variable changes the value of the object, 
 * it will be affected to all the reference variables.
 *  That is why string objects are immutable in java.
 * */





