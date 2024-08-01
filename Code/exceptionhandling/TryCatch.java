//Exception Handling -> The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so
//that the normal flow of the application can be maintained.

//Exception: Exception is the event that occurs when a program is executed disrupting the normal flow of instructions.
//Two types of exceptions: 1. Checked Exception (Compile Time Exception) 2. Unchecked Exception (Runtime Exception)

package core.exceptionhandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		//simple try and catch block
		//try -> try contains the statement which may cause the exception (try to execute statement that may contain exception)
		//catch -> catch block catch the exception. There is have multiple catch blocks
		
		try {
			System.out.println(10/n);
		}
		//This block catch the all exceptions (main class)
		catch (Exception e) {
			System.out.println("Catch Block "+e);
		}
	}

}
