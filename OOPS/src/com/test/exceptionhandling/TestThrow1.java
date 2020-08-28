package com.test.exceptionhandling;

public class TestThrow1{  
	
	
	   static void validate(int age){  
		   
	     if(age<18)  
	      throw new ArithmeticException("not valid age");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){ 
		  
		   try {
	      validate(16);  
		   }
		   catch(Exception e) {
			   System.out.println(e.getStackTrace());
		   }
	      
	      System.out.println("rest of the code...");  
	  }  
	}  
