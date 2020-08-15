package com.test.abstraction;

//abstract class
abstract class Animals{
	abstract void sound();
	public void simpleMethod() {
		System.out.println("I am simple method");
	}
}


//concrete class
 public class AbstractionProcess  extends Animals{

	 
		@Override
		void sound() {
			System.out.println("I am sound method");
			
		}

	public static void main(String[] args) {
		Animals an= new AbstractionProcess();
		
		
		
         an.sound();
         an.simpleMethod();
	
	}


}
