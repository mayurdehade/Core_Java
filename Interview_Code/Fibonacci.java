package com.jbk.practice01;

import java.util.Scanner;

public class Fibonacci {
	
	static int fib(int n) {
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		System.out.println("Fibonacci series: ");
		for(int i=0; i<=n; i++) {
			System.out.print(fib(i)+" ");
		}

	}

}
