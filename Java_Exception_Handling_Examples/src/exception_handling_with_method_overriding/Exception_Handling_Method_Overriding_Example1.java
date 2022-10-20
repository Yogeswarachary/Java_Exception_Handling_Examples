package exception_handling_with_method_overriding;

import java.io.IOException;

class Parent{
	//method1
	void msg() {
		System.out.println("parent method");
	}
}

public class Exception_Handling_Method_Overriding_Example1 extends Parent{
	//overriding the method in child class
	//gives compile time error
	void msg() throws ArithmeticException{
		System.out.println("Child method");
	}
	public static void main(String[] args) {
		Parent obj1=new Exception_Handling_Method_Overriding_Example1();
		obj1.msg();
	}
}


