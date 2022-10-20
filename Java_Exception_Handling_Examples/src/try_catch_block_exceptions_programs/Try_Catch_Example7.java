package try_catch_block_exceptions_programs;

public class Try_Catch_Example7 {
	public static void main(String[] args) {
		try {
			int data1=50/0;
		} catch(Exception e) {
			int data2=60/0;
		}
		System.out.println("Rest of the code");
	}
}
