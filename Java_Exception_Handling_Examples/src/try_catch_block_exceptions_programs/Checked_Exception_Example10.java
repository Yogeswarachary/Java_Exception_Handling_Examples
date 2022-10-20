package try_catch_block_exceptions_programs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Checked_Exception_Example10 {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw=new PrintWriter("abc.txt");
			pw.println("Saved");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}
