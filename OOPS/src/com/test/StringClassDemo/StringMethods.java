package com.test.StringClassDemo;

public class StringMethods {
	public static void main(String[] args) {
		String s = "    I am learning Java at DataTest!     ";
		System.out.println("The output of s.length() is " + s.length());
		System.out.println("The output of s.charAt(10) is " + s.charAt(10));
		System.out.println("The output of s.substring(4) is " + s.substring(4));
		System.out.println("The output of s.substring(5,10) is " + s.substring(10, 18));
		String s1 = "Data", s2 = "Test";
		System.out.println("The output of s1.concat(s2) is " + s1.concat(s2));
		System.out.println("The output of s.indexOf('D') is " + s.indexOf("D"));
		System.out.println("The output of s.length() is " + s.length());
		System.out.println("The output of s1.equals(s2) is " + s1.equals(s2));
		System.out.println("The output of s1.compareTo(s2) is " + s1.compareTo(s2));
		System.out.println("The output of s.toLowerCase() is " + s.toLowerCase());
		System.out.println("The output of s.toUpperCase() is " + s.toUpperCase());
		System.out.println("The output of s.trim() is " + s.trim());
	}
}