package com.test.FileHandling;
import java.io.*;
public class WriterExample {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("C:\\aws\\output.txt");
			String content = "I love my country";	
			w.write(content);
			w.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*abstract class parent{

	sub(){
		"I am child";
	}
}

class child extends parent{
	add(){
		"I am child";
	}
}
class test{
	psvm(String z[]){
		parent p = new child();
		p.add();
		p.sub();
	}
}*/
