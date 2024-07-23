//Program to demonstrate the Arithmetic Operators and Increment and Decrement Operators

package core.javabasic.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Substraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		System.out.println("Division: " + (num1 / num2));
		System.out.println("Modulo: " + (num1 % num2));

		// Pre and Post Increment
		System.out.println("Value of num1: " + num1 + " After the ++num1 (pre): " + (++num1)); // pre
		System.out.println("Value of num1: " + num1 + " After the num1++ (post): " + (num1++)); // post

		// Pre and Post Decrement
		System.out.println("Value of num2: " + num2 + " After the --num2 (pre): " + (--num2)); // pre
		System.out.println("Value of num2: " + num2 + " After the num2-- (post): " + (num2--)); // post
	}

}
