//Program to demonstrate the ternary operator
package core.javabasic.conditionalstatements;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// Ternary operator -> a shorthand for an if-else statement
		// It takes three operands: a condition, a value if the condition is true
		// and a value if the condition if false.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int n = sc.nextInt();

		String result = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(n + " is " + result);
	}

}
