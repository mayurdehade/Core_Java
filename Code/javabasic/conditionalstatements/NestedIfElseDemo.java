//Cascaded if else demo
//Program to find the given number is positive even odd or negative even odd
package core.javabasic.conditionalstatements;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {

		// if else condition under if else
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();

		if (n > 0) {
			if (n % 2 == 0) {
				System.out.println("Positive even number");
			} else {
				System.out.println("Position odd number");
			}
		} else if (n < 0) {
			if (n % 2 == 0) {
				System.out.println("Negative even number");
			} else {
				System.out.println("Negative odd number");
			}
		} else {
			System.out.println("Number is not positive or negative it is zero");
		}

	}

}
