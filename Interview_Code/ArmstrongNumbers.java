package com.jbk.practice01;

import java.util.Scanner;

public class ArmstrongNumbers {
	
	static int cub(int n) {
		return n*n*n;
	}
	
	static void armstrongNumber(int n) {
		int n1 = n, add=0;
		while(n1!=0) {
			add = add + cub(n1%10);
			n1 /= 10;
		}
		
		if(n == add) System.out.println("Given number is armstrong number");
		else System.out.println("Given number is not armstrong number");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		armstrongNumber(n);
	}

}
