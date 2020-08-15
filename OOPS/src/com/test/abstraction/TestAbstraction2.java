package com.test.abstraction;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bikee {
	Bikee() {
		System.out.println("Bikee is created");
	}

	abstract void run();
	abstract void stop();
	
	void changeGear() {
		System.out.println("gear changed");
	}
}

// Creating a Child class which inherits Abstract class
class Honda extends Bikee {
	void run() {
		System.out.println("running safely..");
	}

	@Override
	void stop() {
		System.out.println("stoppped..");
		
	}
}

// Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2 {
	public static void main(String args[]) {
		Bikee obj = new Honda();
		obj.run();
		obj.stop();
		obj.changeGear();
	}
}