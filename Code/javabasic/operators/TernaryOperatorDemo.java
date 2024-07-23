//Program to demonstrate the Ternary Operators (? :)
//Only conditional operator that takes three operands.
//one-liner replacement for the if-then-else statement 
package core.javabasic.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();

		// even or odd number logic
		// variable = condition ? true : false
		// variable = Expression1 ? Expression2 : Expression3
		String result = (num % 2 == 0) ? "Number is Even" : "Number is Odd";
		System.out.println(result);
	}

}
