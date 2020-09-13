package com.test.JVM;

public class ClassLoaderExample {
	public static void main(String[] args) {
		// Let's print the classloader name of current class.
		// Application/System classloader will load this class
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		// If we print the classloader name of String, it will print null because itis
		// an
		// in-built class which is found in rt.jar, so it is loaded by
		// Bootstrapclassloader
		System.out.println(String.class.getClassLoader());
	}
}