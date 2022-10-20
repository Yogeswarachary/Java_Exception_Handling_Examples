package java_throws_keyword_examples;

import java.io.IOException;

class M{  
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	} 

public class Java_Throws_Example3 {
	public static void main(String args[])throws IOException{//declare exception  
	     M m=new M();  
	     m.method();  
	  
	    System.out.println("normal flow...");  
	  }  
}
