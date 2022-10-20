package more_examples_on_try_catch;

public class Multiple_Catch_Blocks_Example1 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/1;
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception occurs");
		}
		catch(Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("Rest of the code");
	}
}
