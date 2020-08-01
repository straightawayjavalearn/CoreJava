package com.datatest.operators;

import java.io.*;
public class ArithmeticOperator {
	public static void main(String[] args) throws IOException {
		int add, sub, mul, div, mod;
		int num1 = 5, num2 = 8;
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num2 % num1;
		System.out.println("Addition num1+num2 " + add);
		System.out.println("Subtraction num1-num2 " + sub);
		System.out.println("Multiplication num1*num2 " + mul);
		System.out.println("Division num1/num2 " + div);
		System.out.println("Modulus num2%num1 " + mod); // 8%5
	}
}
