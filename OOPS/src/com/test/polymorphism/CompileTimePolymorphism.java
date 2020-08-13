package com.test.polymorphism;

//polymorphism , method overloading & compile time polymorphsm
class Calculator {
	
	int addition(int operand1, int operand2) {
		return operand1 + operand2;
	}

	int addition(int operand1, int operand2, int operand3) {
		return operand1 + operand2 + operand3;
	}
	String addition(String name) {
		return "I am" +name;
	}

}

public class CompileTimePolymorphism {
	public static void main(String args[]) {
		Calculator obj = new Calculator();
		System.out.println("Addition of two operands is" + obj.addition(10, 20));//compile time poly.. method we know
		System.out.println("Addition of three operands is" + obj.addition(10, 20, 30));
		System.out.println("Addition of String method called " + obj.addition("JAva"));
	}
}