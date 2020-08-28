package com.test.typecast;

import java.util.Scanner;

public class NarrowingExample {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		
		int i = sc.nextInt();
		
		char ch =  (char) i;
		
		System.out.println("Character value of the given integer: " + ch);
		
	}
}