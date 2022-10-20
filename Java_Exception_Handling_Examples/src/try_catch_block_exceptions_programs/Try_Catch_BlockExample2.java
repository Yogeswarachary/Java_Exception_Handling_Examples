package try_catch_block_exceptions_programs;

public class Try_Catch_BlockExample2 {
	public static void main(String[] args) {
		//Try block
		try {
			int a=100/0;
		}
		//catch block
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Remaining code is running...");
	}
}
