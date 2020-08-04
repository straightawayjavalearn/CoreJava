package com.test.controlStatements;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Understanding if statements.");
		
		int a=5;
		if(a==9) //scope/block started 
		{
			System.out.println("hey I am equal");
		}//scope/block ended
		else {
			System.out.println("hey I am not equal");
		}
	}
}