//Program to print the all prime numbers in range
package core.interviewproblems;

import java.util.Scanner;

public class PrimeInRange {
	
	//program to find prime number
	public static boolean isPrime(int n) {
		if(n==2) return true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	//program to find prime number in range
	public static void primeInRange(int n) {
		System.out.println("Prime Numbers: ");
		for(int i=2; i<=n; i++) {
			if(isPrime(i))
				System.out.println(i+" ");
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		primeInRange(a);
	}

}
