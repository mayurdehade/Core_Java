//Write a program for writing any digit in word (single digit).
package com.jbk.practice01;

import java.util.Scanner;

public class DititToWord01 {
	
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
		System.out.println("Enter the single number: ");
		int n = sc.nextInt();
		
		System.out.println("Digit to Word: "+digitToWord(n));
		

	}

}
