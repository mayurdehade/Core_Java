//Write a program for finding factorial of a number (recursion)
package com.jbk.practice01;

import java.util.Scanner;

public class Factorial01 {
	
	static int fact(int n) {
		if(n<=1) return 1;
		
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();
		
		System.out.println("Factorial of "+n+": "+fact(n));
		
	}

}
