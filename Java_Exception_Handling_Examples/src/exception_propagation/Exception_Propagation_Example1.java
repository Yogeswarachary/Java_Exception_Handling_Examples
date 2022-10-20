package exception_propagation;

//Exception propagation means, if one method may cause possibility of exception
//then the try and catch blocks are there some where else. then compiler will
//find the try and catch blocks and the exception can be handled.

public class Exception_Propagation_Example1 {
	void method1() {
		int data=50/0;
	}
	void method2() {
		method1();
	}
	void method3() {
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		Exception_Propagation_Example1 obj1=new Exception_Propagation_Example1();
		obj1.method3();
		System.out.println("Normal flow");
	}
}
