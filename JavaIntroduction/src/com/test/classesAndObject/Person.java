package com.test.classesAndObject;

import java.io.Serializable;

public class Person implements Cloneable {
	// Class
	int age;  //data members
	String name;
	char gender;
	//function or methods or behaviour
	Person(){
		System.out.println("I am default constructor");	
	}
	//parameterized constructor
	Person(int age , String name ,char gender ){
		System.out.println("I am parameterized constructor");	
		this.age=age;
		this.name=name;
		this.gender=gender;
	}
	void speak() {
		System.out.println("Hello I am able to speak");
	}
	
	void run() {
		System.out.println("Hello I am able to run");
	}
	void print() {
		System.out.println("name is "+this.name +" age "+this.age+" gender "+this.gender);
	}

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		//Person Adam= new Person(34,"ADAM",'M');
		
		Person Adam1 = new Person();//object created using new keyword
		Adam1.print(); //using that object we called print()

		//object created using Class package
		/*Person adam2 = (Person)Class.forName("com.test.classesAndObject.Person").newInstance();
		adam2.print();
		adam2.speak();
		adam2.run();*/
		
		//objected created using Clone()
		
		Person adamclone = (Person)Adam1.clone();
		adamclone.print();
		
		
		
		
		
	}
	
}

