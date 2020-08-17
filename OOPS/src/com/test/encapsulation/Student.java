package com.test.encapsulation;

 class StudentInfo {
	private String name;
	private int marks;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}


public class Student {
	public static void main(String x[]) {
		StudentInfo st= new StudentInfo();
	    st.setName("Nitin");
	    st.setMarks(35);
	    st.setAddress("Pune");
		
	    System.out.println("Name is  "+st.getName());
	    System.out.println("Marks is  "+st.getMarks());
	    System.out.println("Address is  "+st.getAddress());
		
	}
	
}
