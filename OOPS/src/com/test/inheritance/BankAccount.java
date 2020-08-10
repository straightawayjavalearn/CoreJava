package com.test.inheritance;
//tight coupling and loose coupling 
interface Creditcard {
	 public void dollar() ;
	public void Ruppes() ;
 public void Pounds() ;
	
}


//implementation class
 class BankAccount implements Creditcard{
	

	public static void main(String args[]) {
		BankAccount obj = new BankAccount();
		obj.dollar();
	}

	@Override
	public void dollar() {
		System.out.println("I am dollar");
		
	}

	@Override
	public void Ruppes() {
		System.out.println("I am Ruppes");
		
	}

	@Override
	public void Pounds() {
		System.out.println("I am Pounds");
		
	}


}