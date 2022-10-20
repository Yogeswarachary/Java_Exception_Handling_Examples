package more_examples_on_try_catch;

public class Multiple_Catch_Block_Example2 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index bound exception");
		} catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
