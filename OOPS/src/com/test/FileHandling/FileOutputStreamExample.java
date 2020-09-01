package com.test.FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
        	   
             FileOutputStream fout=new FileOutputStream("C:\\aws\\testout.txt");    
             BufferedOutputStream bout = new BufferedOutputStream(fout);
             String s= "This is java class" ;
             
             byte b[]=s.getBytes(); //converting string into byte array
             
             bout.write(b);
             bout.close();
             System.out.println( "success..." );  
            }
           catch(Exception e){
        	   System.out.println(e);
        	   
           }    
      }    
}  
