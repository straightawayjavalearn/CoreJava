package com.test.datatypes;


import java.io. * ;
import java.util. * ;
class DataTestArray {
  public static void main(String[] args) throws IOException {
	  //int arr[] = new int[100]; storage space 100 integers
    int i;
    Scanner sc = new Scanner(System. in);
    int arr[] = new int[] {
      1,
      2,
      3,
      4,
      5
    };
    System.out.println(" first index is "+arr[1]);
 /*   int arr1[] = new int[5];
    for (i = 0; i < 5; i++) {
      System.out.println("Enter your number");
      arr1[i] = sc.nextInt();
    }
    System.out.println("The array which was previously assigned");
    for (i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("");
    System.out.println("The array you entered is:");
    for (i = 0; i < 5; i++) {
      System.out.println(arr1[i]);
    }*/
  }
}
