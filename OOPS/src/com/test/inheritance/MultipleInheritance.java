package com.test.inheritance;

interface Fruit2 {
	public void fruitname() ;

}

interface Mango2 {
	public void taste();

}

interface Applee extends Fruit2, Mango2 {
	public void tasteofApple();
}

//class Citruss extends Fruit2 extends Mango2 extends Applee{
class Citruss implements Applee {
	@Override
	public void taste() {
		System.out.println("My taste is sweet");
	}

	public void tasteofCitrus() {
		System.out.println("My taste is sour");
	}

	public void fruitname() {
		System.out.println("I am a Fruit");
	}

	public void tasteofApple() {
		System.out.println("My taste is sour and sweet");
	}
}

public class MultipleInheritance {
	public static void main(String args[]) {

		Citruss obj = new Citruss();

		obj.fruitname();
		obj.taste();
		obj.tasteofApple();
		obj.tasteofCitrus();

	}
}