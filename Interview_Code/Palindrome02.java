//Java program to check if string is Palindrome.
package com.jbk.practice01;

import java.util.Scanner;

public class Palindrome02 {
	
	static void palindrome(String s) {
		String reverse = "";
		char c;
		
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		
		if(s.equals(reverse)) System.out.println("Given string is palindrome");
		else System.out.println("Given string is not palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		palindrome(s);

	}

}
