//Program to convert decimal number to binary code
package core.interviewproblems;

import java.util.Scanner;

public class DecimalToBinary {
	
	//method for convert decimal to binary
	public static int decimalToBinary(int dec) {
		int bin=0, rem=0, pow=0;
		while(dec!=0) {
			rem = dec%2;
			dec/=2;
			
			bin = bin + rem*(int)Math.pow(10, pow);
			pow++;
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int dec = sc.nextInt();
		System.out.println("Binary of "+dec+" is "+decimalToBinary(dec));
	}

}
