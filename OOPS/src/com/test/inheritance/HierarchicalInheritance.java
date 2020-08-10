package com.test.inheritance;
//parent or base or super class
class Fruitt {
	void fruitname() {
		System.out.println("I am a Fruit");
	}
}
//subclass of fruit
class Mangoo extends Fruitt {
	void taste() {
		System.out.println("My taste is sweet");
	}
}
//subclass of fruit
class Apple1 extends Fruitt {
	void tasteofApple() {
		System.out.println("My taste is sour and sweet");
	}
}
//subclass of fruit
class Citrus extends Fruitt {
	void tasteofCitrus() {
		System.out.println("My taste is sour");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {

		Citrus obj = new Citrus();
		Mangoo obj1 = new Mangoo();
		Apple1 obj2 = new Apple1();
		obj.fruitname();
		obj.tasteofCitrus();
		
		
		obj1.taste();
		obj2.tasteofApple();
		

	}
}
