//Write a program to finding factorial of a number (using loops)
package com.jbk.practice01;

import java.util.Scanner;

public class Factorial02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial: ");
		int n=sc.nextInt();
		
		int n1=n, fact1=1;
		while(n1>1) {
			fact1 *= n1;
			n1--;
		}
		
		System.out.println("Factorial using while loop of "+n+": "+fact1);

		int n2=n, fact2=1;
		for(int i=1; i<=n; i++) {
			fact2 *= i;
		}
		
		System.out.println("Factorial using for loop of "+n+": "+fact2);
	}

}
