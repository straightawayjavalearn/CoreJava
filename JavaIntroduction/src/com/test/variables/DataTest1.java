package com.test.variables;

import java.io. * ;
class DataTest1 {
	
  static int studentCount;
  DataTest1() {
    studentCount = 15;
  }
  void addStudent() {
    studentCount++;
  }
  public static void main(String[] args) throws IOException {
	  System.out.println("initally " + studentCount);
	  DataTest1 java = new DataTest1();
	  System.out.println("second level  " + studentCount);
	  DataTest1 python = new DataTest1();
	  System.out.println("third  level  " + studentCount);
    java.addStudent(); 
    System.out.println("fourth  level  " + studentCount);
    python.addStudent();
    System.out.println("Total Students " + studentCount);
  }
}