package com.test.exceptionhandling;

import java.io.*;

class Parentss {
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

class TestExceptionChild2 extends Parentss {
	void msg() { //throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parentss p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}