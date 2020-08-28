package com.test.exceptionhandling;

class InvalidAgeException extends Exception {
	
	InvalidAgeException(String s) {
		super(s);
	}
}

class InvalidLengthException extends Exception{
	
	InvalidLengthException(String names){
		super(names);
}
	

	
}


class TestCustomException1 {
	
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid age");
		else
			System.out.println("welcome to vote");
	}
	
	
	static void nameLengthCheck(String name) throws InvalidLengthException {
		if(name.length() >=4) {
				throw new InvalidLengthException("Name length should be less than 4");
			}
			else {
				System.out.println("Name length is OK");
			}
		}

	public static void main(String args[]) {
		try {
			validate(45);
			nameLengthCheck("nitinn");
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}
		System.out.println("rest of the code...");
	}
}