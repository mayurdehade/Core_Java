//Write a program for reverse a number 123 - 321.
package com.jbk.practice01;

import java.util.Scanner;

public class ReverseNumber {
	
	static int reverse(int n) {
		int reverse=0;
		while(n!=0) {
			reverse = reverse*10 + (n%10);
			n/=10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("Reverse of number "+n+" is "+reverse(n));

	}

}
