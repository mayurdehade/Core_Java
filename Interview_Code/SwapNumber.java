//How to swap two numbers without using a third variable?
package com.jbk.practice01;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value after swaped: a="+a+", b="+b);

	}

}
