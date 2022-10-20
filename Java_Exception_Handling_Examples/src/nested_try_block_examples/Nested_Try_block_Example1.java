package nested_try_block_examples;

public class Nested_Try_block_Example1 {
	public static void main(String[] args) {
		
		//outer try block
		try {
			//inner try block
			try {
				System.out.println("going to divide by 0");
				int b=20/0;
			}
			//catch block for inner try block
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			//inner try block 2
			try {
				int a[]=new int[5];
				//assigning the value out of array bounds
				a[5]=10;
			}
			
			//catch for 2nd inner try block
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			System.out.println("Other statement");
		}
		
		//Catch block for outer try block
		catch(Exception e) {
			System.out.println("Handled the exception by the outer catch");
		}
	}
}
