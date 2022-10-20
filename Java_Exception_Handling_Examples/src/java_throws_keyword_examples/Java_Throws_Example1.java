package java_throws_keyword_examples;

import java.io.IOException;

public class Java_Throws_Example1 {
	//method1 with exception
	void method1() throws IOException{
		throw new IOException("Device error");//Checked exception//runtime exceptions
	} 
	
	//method2 throws method1 exception
	void method2() throws IOException{
		method1();
	}
	
	//method3 throws already catched exception from method2
	void method3() throws IOException{
		method2();
	}
	
	//method4 throws already catched exception from method3
	void method4() {
		try {
			method3();
		} catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	
	public static void main(String[] args) {
		//Creating object for the class
		Java_Throws_Example1 obj1=new Java_Throws_Example1();
		//calling method with the class object
		obj1.method4();
		System.out.println("Execution flow continues");
	}
}
