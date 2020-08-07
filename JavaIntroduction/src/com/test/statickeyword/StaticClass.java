package com.test.statickeyword;

class OuterClass {
	private static String messageToReaders = "Hello Readers !Welcome to DataTest";

	// Static nested class
	public static class NestedStaticClass {
		// static class
		public void myMessage() {
			System.out.println("Message from nested static class: " + messageToReaders);
		}
	}

	// non-static nested class
	public class InnerClass {
		public void display() {
			System.out.println("Message from non-static nested class:" + messageToReaders);
		}
	}
}

public class StaticClass {
	public static void main(String args[]) {
		// instance of nested Static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		// call non static method of nested static class
		printer.myMessage();
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		// calling non-static method of Inner class
		inner.display();
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.display();
	}
}
