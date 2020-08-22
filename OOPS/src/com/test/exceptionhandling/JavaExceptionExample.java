package com.test.exceptionhandling;

public class JavaExceptionExample{  
	
	  public static void main(String args[]){  
	   try
	   {  
	      //code that may raise exception  
		 //  String s= null ;
		 //System.out.println(s.length()); //NullPointerException
		   int a[]= new int [5];
		  a[10]= 50 ; //ArrayIndexOutOfBoundsException
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
		   }  
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  