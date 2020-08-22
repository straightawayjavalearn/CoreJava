package com.test.exceptionhandling;

public class MultipleCatchBlock1 {  
	  
    public static void main(String[] args) {  
          
              try{    
              int a[]=null;   
                System.out.println(a[0]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }  
              catch(NullPointerException e)  
              {  
               System.out.println("Nullpointer Exception occurs");  
              }  
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");     }  
}  
