package com.test.statickeyword;

public class StaticBlock {

	static String sentence;
	static int number; //8 byte
	static {
		sentence = "Welcome to java class";
		number = 69;
	}

	public static void main(String args[]) {
		System.out.println(sentence);
		System.out.println("Value of Integer: " + number);
	}
	
}
