//Print the number of digit in the number

//This loop will execute the code block once, 
//before checking if the condition is true, 
//then it will repeat the loop as long as the condition is true.

package core.javabasic.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		/*
		 * syntax 
		 * do { 
		 * 		//code statement 
		 * } while(condition)
		 */

		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n > 0);

		System.out.println("Number of digit is: " + count);
	}

}
