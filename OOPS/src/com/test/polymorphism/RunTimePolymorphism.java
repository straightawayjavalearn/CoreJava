package com.test.polymorphism;

//Runtime poly also method overridding 
//base class
class Multiplication {
    int calculate(int operand1, int operand2) {
		return operand1 * operand2;
	}
}
//child class or derived class
class Division extends Multiplication {
	int calculate(int operand1, int operand2) {
		return operand1 / operand2;
	}
}
class Substraction extends Multiplication{
	int calculate(int operand1, int operand2) {
		return operand1 - operand2;
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args) {

		Multiplication obj = new Multiplication();
		System.out.println("Multiplication of two operands is" + obj.calculate(20, 10));

		Multiplication obj1 = new Division();
		System.out.println("Division of two operands is" + obj1.calculate(20, 10));
        
		Multiplication obj3 = new Substraction();
		System.out.println("Substraction of two operands is" + obj3.calculate(35, 30));
		
	}

}