package try_catch_block_exceptions_programs;

public class Try_Catch_Example6 {
	public static void main(String[] args) {
		int i=50;
		int j=0;
		int data;
		try {
			data=i/j;//may throw exception
		} catch(Exception e) {
			System.out.println(i/(j+2));
		}
	}
}
