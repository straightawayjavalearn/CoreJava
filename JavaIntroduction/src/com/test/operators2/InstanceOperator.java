package com.test.operators2;

interface Body{
	
}
public class InstanceOperator extends ABC implements Body{

	public static void main(String[] args) {

		InstanceOperator ob= new InstanceOperator();
		ABC a= new ABC();
		//System.out.println("hello"+"java"+"today");
    System.out.println("Is ob an instance of InstanceOperator class? "+ (ob instanceof InstanceOperator));
    System.out.println("Is a an instance of InstanceOperator class? "+ (a instanceof ABC));

	}

}
