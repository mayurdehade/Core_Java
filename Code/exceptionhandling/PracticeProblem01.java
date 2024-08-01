/*
 * Write a program that allow you to keep accessing an array until a valid index is given.
 * If max retries exceed 5 print "Error".
 * Modify the program to throw a custom exception if more retries are reached.
 */
package core.exceptionhandling;

import java.util.Scanner;

//custom class for exception
class ErrorOccur extends Exception {

	@Override
	public String toString() {
		return "Error :(";
	}
	
}

public class PracticeProblem01 {

	public static void main(String[] args) {
		int i=1, index;
		boolean flag = true;
		int arr[] = new int[2];
		arr[0] = 23;
		arr[1] = 33;
		
		Scanner sc = new Scanner(System.in);
		
		while(i<=5 && flag) {
			System.out.println("Enter the array index: ");
			index = sc.nextInt();
			
			try {
				System.out.println("Element of array: "+arr[index]);
				flag = false;
			}
			catch (Exception e) {
				System.out.println("This index doesn't exist. Try again");
			}
			i++;
			if(i>5) {
				try {
					//object
					throw new ErrorOccur();
				}
				catch(ErrorOccur e) {
					System.out.println(e);
				}
			}
		}
	}

}
