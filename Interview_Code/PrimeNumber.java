//Write a program to find prime number;
package com.jbk.practice01;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime number");
				return;
			}
		}
		
		System.out.println(n+" is prime number");
		
	}

}
