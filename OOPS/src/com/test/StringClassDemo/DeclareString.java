package com.test.StringClassDemo;

public class DeclareString {
  public static void main(String[] args) {
    String course = "Java";
    String course1 = new String("Python");
    System.out.println(course);
    System.out.println(course1);
    
    System.out.println("address1  " +course.hashCode());
    System.out.println("address2  " +course1.hashCode());
  }
}