//If we have multiple condition to check then we use the if else if statement

//Program to demonstrate the largest among 3 numbers
package core.javabasic.conditionalstatements;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Largest number: " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number: " + b);
		} else if (c > a && c > b) {
			System.out.println("Largest number: " + c);
		} else {
			System.out.println("Largest numbers is not exist");
		}
	}

}
