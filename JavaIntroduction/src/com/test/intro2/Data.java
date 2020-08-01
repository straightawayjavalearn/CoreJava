package com.test.intro2;

import java.io.IOException;

public class Data {

void teachJava() {
   System.out.println("Teaching Java by Nitin") ;
 }

public static void main (String [] args) throws IOException {
	System.out.println("In main") ;
	 Data ob = new Data () ;
      ob.teachJava();
	 }
}