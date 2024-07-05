//Write a program for writing digits in words 240 - two four zero.
package com.jbk.practice01;

import java.util.Scanner;

public class DititToWord02 {
	
	static String digitToWord(int n) {
		switch(n) {
		case 0: 
			return "zero";
		case 1: 
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		}
		return "invalid";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int reverse=0;
		
		System.out.println("Digit to world: ");
		while(n!=0) {
			reverse = reverse*10 + (n%10);
			n/=10;
		}
		
		while(reverse!=0) {
			System.out.print(digitToWord(reverse%10)+" ");
			reverse/=10;
		}
		

	}

}

