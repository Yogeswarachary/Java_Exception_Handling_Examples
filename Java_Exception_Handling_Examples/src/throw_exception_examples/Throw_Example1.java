package throw_exception_examples;

public class Throw_Example1 {
	
	//creating function to check person is able to vote or not
	public static void validate(int age) {
		if(age>18) {
			System.out.println("Person is eligible for vote");
		}
		else {
			throw new ArithmeticException("Not eligle for vote");
		}
	}
	public static void main(String[] args) {
		validate(12);
		System.out.println("Rest of the code");
	}
}
