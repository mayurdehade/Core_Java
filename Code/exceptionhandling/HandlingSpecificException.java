//Handling Specific Exception (Multiple Catch Blocks)
package core.exceptionhandling;

import java.util.Scanner;

public class HandlingSpecificException {

	public static void main(String[] args) {
		int marks[] = new int[3];
		marks[0] = 80;
		marks[1] = 56;
		marks[2] = 83;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array index: ");
		int index = sc.nextInt();
		System.out.println("Enter the number you want to divide: ");
		int n = sc.nextInt();

		try {
			System.out.println("The value at array index entered is: " + marks[index]);
			System.out.println("The value of array-value/number is: " + marks[index] / n);
			System.out.println("Statement after the exception");
		} catch (ArithmeticException e) {
			System.out.println("Division not completed... Reason: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array not contain the element at entered index " + e);
		} catch (Exception e) {
			System.out.println("Some exception occured! " + e);
		}

	}

}
