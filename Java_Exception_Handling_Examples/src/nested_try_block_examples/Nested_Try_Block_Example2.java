package nested_try_block_examples;

public class Nested_Try_Block_Example2 {
	public static void main(String[] args) {
		
		//Outer try block
		try {
			//inner try block
			try {
				System.out.println("arthimatic error");
				int a=2/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			//2nd inner try block
			try {
				System.out.println("Array outof bound exception");
				int a[]=new int[3];
				a[3]=10;
			}
			
			//catch block for 2nd inner try block
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		//catch block for outer try block
		catch(Exception e) {
			System.out.println("Handling via outer catch block");
		}
	}
}
