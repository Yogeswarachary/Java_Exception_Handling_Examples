package more_examples_on_try_catch;

public class Multiple_Catch_Block_Example3 {
	public static void main(String[] args) {
		//try block
		try {
//			System.out.println("inside try block");
//			int a=20/0;
			int a[]=new int[3];
			a[3]=4;
		}
		//catch block1
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		//catch block2
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		//catch block3
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			int b=20+20;
			System.out.println("code executed: "+b);
		}
		System.out.println("Rest of the code");
		
	}
}
