//Creating the custom exception
//We can write our custom exceptions using exception class in java.
//throw keyword
package core.exceptionhandling;

import java.util.Scanner;

//Creating the class for handle exception (Inherit from Exception class)
class MyException extends Exception {
	//Methods
	public String toString() {
		return super.toString() + "I am toString()";
	}
	
	public String getMessage() {
		return "I am getMessage()";
	}
}

public class CustomeException {

	public static void main(String[] args) {
		int a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		a = sc.nextInt();
		
		if(a<19) {
			try {
				//If conditon is true then throw the exception
				//and this exception is catch by catch block
				throw new MyException(); //creating the object by using new keyword
				//We can throw the inbuilt exceptions
				//throw new ArithmeticException();
			}
			catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(e); //calls to string
				e.printStackTrace();
			}
		}
	}

}
