package java_throws_keyword_examples;

import java.io.IOException;
 
class EgClass{
	//method1 with the Exception class
	void method1() throws IOException{
		throw new IOException("Device error");
	}
}


public class Java_Throws_Example2 {
	public static void main(String[] args) {
		//creating object for the above class inside the try block
		//and calling the method with the help of object
		try {
			EgClass obj1=new EgClass();
			obj1.method1();
		}
		catch(Exception e) {
			System.out.println("Exception handled successfully");
		}
		System.out.println("Normal flow of code is executing...");
	}
}

