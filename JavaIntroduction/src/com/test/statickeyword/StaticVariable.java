package com.test.statickeyword;

class Employee {
	int empId; //instance variables
	String empName;
	static String companyName = "TCS";

	// constructor to initialize the variable
	Employee(int id, String name) {
		empId = id;
		empName = name;
	}

	// method instance method to display values 
	void display() {
		System.out.println(empId + " " + empName + " " + companyName);
	}
}

// class to create and display the values of object
public class StaticVariable {
	public static void main(String args[]) {
		Employee EmployeeObj = new Employee(218, "Kushal");
		Employee EmployeeObj1 = new Employee(635, "Bhumika");
		Employee EmployeeObj2 = new Employee(147, "Renuka");
		// calling display method
		EmployeeObj.display();
		EmployeeObj1.display();
		EmployeeObj2.display();
	}
}
