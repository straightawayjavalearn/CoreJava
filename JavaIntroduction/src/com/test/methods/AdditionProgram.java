package com.test.methods;

class Addition {
	int sum = 0;

	public int additionFunction(int operand1, int operand2) {
		// adding integer values
		sum = operand1 + operand2;
		return sum;
	}
}

class AdditionProgram {
	public static void main(String[] args) {
		// creating an instance of AdditionProgram class
		Addition additionObj = new Addition();
		// calling additionFunction() method to add two integer using
		// instance created in above step.
		int sumValue = additionObj.additionFunction(10, 20);
		System.out.println("Sum of two integer values is : " + sumValue);
	}
}