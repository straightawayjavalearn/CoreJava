package com.test.constructorTest;



class DataTest {
	

	DataTest(){
		System.out.println("I am default");
	}
	DataTest(String name) {
		System.out.println("Constructor with one " + "argument - String : \n " + name);
	}

	DataTest(String name, int age) {
		System.out.print("\n Constructor with two arguments - String andInteger  : " + name + " " + age);
	}

	DataTest(long id) {
		System.out.println();
		System.out.println("Constructor with one argument - Long : " + id);
	
	}
	
	public String myMethod() {
		return "I ammmm simply a method";
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		DataTest simple = new DataTest();
		DataTest ObjectName = new DataTest("Renuka"); //implicit
		DataTest ObjectName1 = new DataTest("Aakash", 26);
		DataTest ObjectName2 = new DataTest(4546465);
		System.out.println(simple.myMethod());//explicitly called 
	}
}