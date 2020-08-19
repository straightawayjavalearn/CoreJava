package com.test.StringClassDemo;

public class DeclareString {
  public static void main(String[] args) {
    String course = "Java"; //string literal
    String course2 = new String("Python");  //using new keyword
   
    
    System.out.println(course);
    System.out.println(course2);
    
    System.out.println("address1  " +course.hashCode());
    System.out.println("address2  " +course2.hashCode());
  }
}