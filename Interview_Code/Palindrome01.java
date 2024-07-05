//Java program to check if number is Palindrome.
package com.jbk.practice01;

import java.util.Scanner;

public class Palindrome01 {
	
	static void palindrome(int n) {
		
		int reverse=0;
		for(int i=n; i!=0; i=i/10) {
			reverse = reverse*10 + i%10;
		}
		
		if(n==reverse) System.out.println("Given number is palindrome");
		else System.out.println("Given number is not palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		palindrome(n);

	}

}
