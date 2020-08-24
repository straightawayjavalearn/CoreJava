package com.test.misc;

interface Accounts{
	
	void fundsAvaibility();
	
}


//base class
class College implements Accounts{
	 String Collegename ="Govt. College";
	  
	 public void softwareLab() {
		 System.out.println("College staff using the soft lab");
	 }

	@Override
	public void fundsAvaibility() {

      System.out.println(" Funds available for college");
		
	}
	
	public void showAll(int numbers) {
		System.out.println("--printing all---");
		for(int i=1; i<=numbers ;i++) {
			System.out.println(i);
		}
	}
	
}

class Sports implements Accounts {

	@Override
	public void fundsAvaibility() {
		  System.out.println(" Funds not available for sports");
		
	}
	
}

//derived or child
class Student extends College {
	private int rolno;
	private String name;
	

	Student(){
		System.out.println("default constructor-->This is Engineering college");
	}
	Student(int rolno,String name){
		this.rolno= rolno;
		this.name= name;
		System.out.println("Your roll no is --> "+rolno+ "  and your name is "+name +" and college is _>"+Collegename);
	}
   //method overloading
	public void marks(int math) {
		System.out.println("Math marks are "+math);
	}
	public void marks(int math, int eng) {
		System.out.println("using constructor overloading -->Math marks "+math+ " English are "+eng);
	}
	
	//softwareLab() is now overriding	
	 public void softwareLab() {
			System.out.println("students staff using the soft lab");
     }
	 
	 //using encapsulation
	public int getRolno() {
			return rolno;
		}
	public void setRolno(int rolno) {
			this.rolno = rolno;
		}
	public String getName() {
			return name;
		}
	public void setName(String name) {
			this.name = name;
		}
}

public class DemoAll {
	public static void main(String x[]) {
		Student s1= new Student();
		Student s2= new Student(1,"Ganesh");
		s2.marks(80,72);
		
		//encapsulation
		Student s3 = new Student();
		s3.setRolno(2);
		s3.setName("Shankar");
		
		System.out.println("using encapsulation -->rol is --> "+s3.getRolno() +" name is -->"+s3.getName() );
		
		College c = new Student();
		c.softwareLab();
		
		//interface test
		
		Accounts a= new Sports();
		a.fundsAvaibility();
		
		//show all
		
		College list = new College();
		list.showAll(50);
		
	}

}
