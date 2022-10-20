package try_catch_block_exceptions_programs;

public class Try_Catch_Example8 {
	public static void main(String[] args) {
		try {
			int data=50/0;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Remaining code");
	}
}
