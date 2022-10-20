package throw_exception_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Example2 {
	//function to check person is eligible for vote or not
	public static void validate() throws FileNotFoundException{
		FileReader file=new FileReader("C:\\Users\\Aqua\\Desktop\\abc.txt");
				BufferedReader fileInput=new BufferedReader(file);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			validate();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
