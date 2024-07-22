//The if-else condition is used to choose between two options,
//but the switch case statement is used to choose between numerous options
package core.javabasic.conditionalstatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Switch Case -> it is used to choose between numerous options
		// The value of the express is compared with the values of each case
		// If there is match, the associated block of code is executed.
		// break keyword breaks out of the switch block
		// this will stop the execution of more code and case testing inside the block.

		// default keyword specifies some code to run if there is no case match
		System.out.print("Enter a number from 1-10:");
		int num1 = sc.nextInt();

		switch (num1) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("You entered incorrect number");
		}
	}

}
