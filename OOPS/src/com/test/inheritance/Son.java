package com.test.inheritance;

class Father {
	String eyeColor = "Blue"; //instance varibales/proprties
	String bloodGroup = "B+";
  
	//method
	void does() {
		System.out.println("Son Inheriting properties from Father");
	}
}

public class Son extends Father {
	
	public static void main(String args[]) {
		Father obj = new Father();
		obj.does();
		System.out.println("Blood Group of son is " + obj.bloodGroup);
		System.out.println("Eye Color of son is " + obj.eyeColor);

	}
}