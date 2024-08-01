/*
 * Finally Block:
 * Finally block contains the code which is always executed whether the exception is handled or not.
 * 
 */
package core.exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {

	static int divide(int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println("Exception occurs " + e);
		}
		// It always executed
		finally {
			System.out.println("Cleaning up resources... This is ending of the function");
			System.out.println(
					"This finally blcok is executed if the return statement return the value then also this executed");
		}
		return 0;
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Division is: " + divide(a, b));
	}

}
