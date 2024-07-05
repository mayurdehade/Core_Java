//Write a program for sum of digits 123 - 6.
package com.jbk.practice01;

import java.util.Scanner;

public class SumOfDigits {
	
	static int sumOfDigits(int n) {
		int sum=0;
		while(n!=0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("Sum of digit "+n+" is "+sumOfDigits(n));

	}

}
