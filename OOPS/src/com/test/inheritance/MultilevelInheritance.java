package com.test.inheritance;

//Super class
class Fruit1 {
	void fruitname() {
		System.out.println("I am a Fruit");
	}
}
//child or derived   //it is also super class for apple
class Mango1 extends Fruit1 {
	void taste() {
		System.out.println("My taste is sweet");
	}
}
//latest child or derived 
class Apple extends Mango1 {
	void tasteofApple() {
		System.out.println("My taste is sour and sweet");
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {

		Apple obj = new Apple();
	
		
		obj.fruitname();
		obj.taste();
		obj.tasteofApple();

	}
}