package try_catch_block_exceptions_programs;

public class Custom_Message_Example5 {
	public static void main(String[] args) {
		try {
			int a=100/0;
		} catch(Exception e) {
			//Custom message
			System.out.println("Inside catch block");
		}
		System.out.println("Rest of the code");
	}
}
