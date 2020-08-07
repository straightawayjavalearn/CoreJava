package com.test.statickeyword;

class Employee1 {
	int empId;
	String empName;
	static String companyName = "TCS";

	// static method to valueChange the value of static variable
	static void valueChange() {
		companyName = "Wipro";
	}
	Employee1(){
		System.out.println("I am default constructor");
	}
	// constructor to initialize the variable
//	Employee1(int id, String name) {
//		empId = id;
//		empName = name;
//	}

	// method to display values
	void display() {
		System.out.println(empId + " " + empName + " " + companyName);
	}
}

// class to create and display the values of object
public class DemoStaticMethod {
	public static void main(String args[]) {
		Employee1 n = new Employee1();
		n.display();
	//	Employee1.valueChange();// calling valueChange method
		// creating objects
		/*Employee1 EmployeeObj = new Employee1(218, "Kushal");
		Employee1 EmployeeObj1 = new Employee1(635, "Bhumika");
		Employee1 EmployeeObj2 = new Employee1(147, "Renuka");*/
		// calling display method
		/*EmployeeObj.display();
		EmployeeObj1.display();
		EmployeeObj2.display();*/
	}
}
