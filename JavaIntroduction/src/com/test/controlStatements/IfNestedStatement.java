package com.test.controlStatements;

public class IfNestedStatement {
	public static void main ( String [] args ) {
	   System.out.println("Understanding nested if statements.");
	   String s = "DataTest" ;
	 
	  //outer if
	   if ( s. equals ( "DataTest" )) {
	      System.out. println ( "The string is equal DataTest" ) ;
	        if ( s. charAt ( 0 ) == 'E' ) //inner if
	        {
	          System.out. println ( "The first character is D! " ) ;
	      }
	    }
	    else {
	    System.out. println ( "The string is not equal DataTest" ) ;
	    }
}
}