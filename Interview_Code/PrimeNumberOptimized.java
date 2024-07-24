//Program to find the prime numbers using optimized way
//run the for loop from 2 to square root of n
package core.interviewproblems;

import java.util.Scanner;

public class PrimeNumberOptimized {

	// program to find prime number
	public static boolean isPrime(int n) {
		if (n == 2)
			return true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Is a prime number: " + isPrime(num));
	}

}
