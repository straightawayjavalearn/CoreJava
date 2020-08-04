package com.test.controlStatements;

import java.util.Scanner;

public class SwitchStatement {
	 public static void main ( String [] args ) {
		 Scanner sc = new Scanner ( System. in ) ;
		 System.out. println ("You have two options of courses") ;
		  System.out. println ("1.Java") ;
		  System.out. println ("2.Python") ;
		  System.out. println ("4.C++") ;
		  System.out. println ("Enter the number of course:") ;
		   int ch = sc. nextInt () ;//4
		   switch ( ch ) {
		   case 1:
		     System.out. println ("Congrats you have chosen Java!") ;
		     break;
		   case 2:
		     System.out. println ("Congrats you have chosen Python!") ;
		     break;
		   case 4:
		     System.out.println("you have chosen C++");
		     break;
		   default:
		     System.out. println ("Wrong input!") ;
		     break;
		   }
		  
		   }
		   }
