package com.test.exceptionhandling;

import java.io.*;

class Parents {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild1 extends Parents {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parents p = new TestExceptionChild1();
		p.msg();
	}
}