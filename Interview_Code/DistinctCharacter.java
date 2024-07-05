//How to get distinct characters (non repeated) an their count in a String?
package com.jbk.practice01;

import java.util.Scanner;

public class DistinctCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		
		for(int i=0; i<str.length(); i++) {
			boolean flag = false;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j) && i!=j) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
