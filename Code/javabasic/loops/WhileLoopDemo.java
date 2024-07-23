//Program to demonstrate the while loop
//Print 1 to n numbers using while loop

//if we don't know how many times we want to run loop then use while loop
//Useful when the number of iterations is not known in advance or based on a condition.

package core.javabasic.loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		/*
		 * syntax: 
		 * while(condition) { 
		 * 		//code to be executed 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.println(i + " ");
			i++; // increment
		}
	}

}

//Difference between for loop and while loop
/*
 * for Loop
 * i. Initialization may be either in the loop statement or outside the loop.
 * ii. Once the statement is executed then increment is done.
 * iii. It is normally used when the number of iterations is known.
 * iv. Condition is a relational expression.
 * v. For loop is entry controlled loop.
 * vi. The for loop is used when the number of iterations is known.
 * 
 * while loop
 * i. Initialization is always outside the loop.
 * ii. The increment can be done before or after the execution of the statement.
 * iii. It is normally used when the number of iterations is unknown.
 * iv. The condition may be an expression or non-zero value.
 * v. It is used for complex initialization.
 * vi. While loop is also entry controlled loop.
 * 
 */
