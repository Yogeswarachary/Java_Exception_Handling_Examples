package throw_exception_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw_Example3 {
	//creating a method
	public static void method() throws FileNotFoundException{
		FileReader file= new FileReader("C:\\Desktop\\abc.txt");
		BufferedReader fileInput=new BufferedReader(file);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			method();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("Remaining code");
	}
}
