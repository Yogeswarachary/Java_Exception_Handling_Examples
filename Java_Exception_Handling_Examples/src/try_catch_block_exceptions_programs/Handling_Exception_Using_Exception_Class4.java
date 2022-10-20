package try_catch_block_exceptions_programs;

public class Handling_Exception_Using_Exception_Class4 {
	public static void main(String[] args) {
		try {
			int a=100/0;
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Remaining data");
	}
}
