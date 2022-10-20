package try_catch_block_exceptions_programs;

public class Try_Catch_Block_Example3 {
	public static void main(String[] args) {
		try {
			int a=100/0;
			//If the above expression executes, then below message print, otherwise not 
			System.out.println("Hello! Yogesh");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Remaining code");
	}
}
