package com.test.StringClassDemo;

import java.nio.charset.Charset;

public class DeclareStrings {
  public static void main(String[] args) {
	  
    byte[] b_arr = {
      68,
      97,
      116,
      97,
      70,
      108,
      97,
      105,
      114
    };
    
    String s_byte = new String(b_arr);
    System.out.println("Direct conversion of byte array " + s_byte);
    
    Charset cs = Charset.defaultCharset();
    String charset = new String(b_arr, cs);
    
    System.out.println("Conversion of byte array by specified character set " + charset);
    String schar = new String(b_arr, 1, 3, cs);
    
    System.out.println("Using character set and offset indexes " + schar);
    
    char carr[] = {
      'D',
      'a',
      't',
      'a',
      'F',
      'l',
      'a',
      'i',
      'r'
    };
    
    String s_carr = new String(carr);
    System.out.println("Using character array " + s_carr);
    
    String s_carr2 = new String(carr, 1, 3);
    System.out.println("Using character array and start index " + s_carr2);
    
    int uni_code[] = {
      68,
      97,
      116,
      97,
      70,
      108,
      97,
      105,
      114
    };
    
    String s_unicode = new String(uni_code, 1, 4);
    System.out.println("Unicode conversion " + s_unicode);
    
    //using string buffer class
    StringBuffer sbuf = new StringBuffer("DataTest");
    System.out.println("The string builder initialization " + sbuf);
    
    //using string builder class
    StringBuilder sbuild = new StringBuilder("Java");
    System.out.println("Using Stringbuilder initialization " + sbuild);
  }
}