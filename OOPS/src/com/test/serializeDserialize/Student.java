package com.test.serializeDserialize;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	//transient String name;
   String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}