package com.test.controlStatements;


public class SwitchProgram1 {
  public static void main(String[] args) {  
     
 //Declaring a variable for switch expression  
      int choice=60,operand1=20,operand2=10,sum; 
      
//Switch expression  
      switch(choice){  
    
  //Case statements  
     
 case 10: 
        sum=operand1+operand2;
        System.out.println("Addition od two numbers is ="+sum);  
      break;  
      
case 20: 
        sum=operand1-operand2;
        System.out.println("Subtraction of two numbers is ="+sum);  
      break;  
      
case 30: 
        sum=operand1*operand2;
          System.out.println("Multiplication of two numbers is ="+sum);  
      break;  
      
case 40: 
        sum=operand1/operand2;
          System.out.println("Division of two numbers is ="+sum);  
      break;  
      
case 50: 
        sum=operand1%operand2;
          System.out.println("Modulus of two numbers is ="+sum);  
      break;  
      //Default case statement  
      
default:System.out.println("Not in the following cases");  
      }  
   }
}