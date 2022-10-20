package nested_try_block_examples;

public class Multiple_Try_Block_Example {
	public static void main(String[] args) {
		//main try block
		try {
			//inner try block1
			try{
				System.out.println("inner try block1");
				int a=70/0;
			}
			//catch block for the first try block
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			//inner try block 2
			try {
				System.out.println("inner try block2");
				int a[]=new int[5];
				a[5]=20;
			}
			//catch block for the second try block
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		//Catch block for outer try block
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			int ab=12+28;
			System.out.println("Finally block executed "+ ab);
		}
		
	}
}
