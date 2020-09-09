package com.test.serializeDserialize;

import java.io.*;

class Persist {
	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(211, "abc");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("C:\\aws\\serializes.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}