//How to reverse a String in Java?
package com.jbk.practice01;

import java.util.Scanner;

public class ReverseString {
	
	static String stringReverse(String s) {
		String reverse = "";
		char c;
		
		for(int i=s.length()-1; i>=0; i--) {
			c = s.charAt(i);
			reverse = reverse+c;
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		System.out.println("Reverse String is: "+stringReverse(s));
		

	}

}
