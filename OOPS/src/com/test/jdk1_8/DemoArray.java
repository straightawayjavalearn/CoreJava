package com.test.jdk1_8;

import java.util.Optional;

public class DemoArray {

	public static void main(String[] args) {

       int arr[]= {23,45,56,45,78};
       arr[5]=(Integer) null;
       
       System.out.println(arr[0]);
       System.out.println(arr[1]);
       
       Optional<Integer> checkvalue = Optional.ofNullable(arr[5]);
       if (checkvalue.isPresent()) {
    	   System.out.println(arr[5]);
       }
       else {
       System.out.println("no value available");
       }
       
	}

}
