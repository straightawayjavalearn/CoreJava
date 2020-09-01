package com.test.FileHandling;

import java.io.FileInputStream;  
public class DataStreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("C:\\aws\\testout.txt");
            for(int k=0;k<=18;k++) {
            int i=fin.read();  
            System.out.print((char)i); 
            
            }
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  