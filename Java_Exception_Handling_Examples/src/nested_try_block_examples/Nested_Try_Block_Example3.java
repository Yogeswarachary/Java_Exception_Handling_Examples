package nested_try_block_examples;

public class Nested_Try_Block_Example3 {
	public static void main(String[] args) {
		
		//outer try block
		try {
			//inner try block1
			try {
				System.out.println("First inner try block");
				int a=20/0;
			}
			//catch block for inner try block1
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			//inner try block2
			try {
				System.out.println("2nd try block code");
				int a[]=new int[5];
				a[5]=10;
			}
			//Catch for inner try block2
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		//catch block for outer try block
		catch(Exception e) {
			System.out.println("Outer catch block is executed");
		}
	}
}
