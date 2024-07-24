//Program to convert Binary number to Decimal
package core.interviewproblems;

import java.util.Scanner;

public class BinaryToDecimal {

	// create method for conversion binary to decimal
	public static int binaryToDecimal(int bin) {
		int dec = 0, pow = 0;
		while (bin > 0) {
			int lastDigit = bin % 10;

			// we multiple last digit of binary number to 2^pow and pow is start from 0 to
			// size of binary number
			dec = dec + lastDigit * (int) Math.pow(2, pow);
			pow++;
			bin /= 10;
		}
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number: ");
		int bin = sc.nextInt();
		System.out.println("Decimal of " + bin + " is " + binaryToDecimal(bin));
	}

}
