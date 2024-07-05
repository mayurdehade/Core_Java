//Java program to check if a vowel is present in the string.
package com.jbk.practice01;

import java.util.Scanner;

public class Vowels {
	
	static String vowelsInString(String s) {
		
		int vowels=0; char c;
		s = s.toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			if('a'==c || 'e'==c || 'i'==c || 'o'==c || 'u'==c) {
				vowels++;
			}
		}
		
		if(vowels!=0) return vowels+" number of vowels present in string";
		return "No vowels found!";
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		
		System.out.println(vowelsInString(s));

	}

}
