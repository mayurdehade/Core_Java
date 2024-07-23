//Program to get input number from user and print that number except the multiple of 10 (don't print)
package core.javabasic.controlstatements;

import java.util.Scanner;

public class ContinueStatement2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter number: ");
			int n = sc.nextInt();
			
			if(n%10==0) {
				System.out.println("Skipped");
				continue;
			}
			System.out.println("You entred number: "+n);
		}
//		System.out.println("Outer Statement"); //error
		//this statement cause error because the above while loop not having break condition
		//it is infinite loop
	}
}
