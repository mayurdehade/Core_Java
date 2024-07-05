//Find largest number in an array.
package com.jbk.practice01;

public class LargestNumberArray {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 4, 0, 3, 7, 6, -5, 1 };

		int max = Integer.MIN_VALUE;

		for (int n : arr) {
			if (max < n) {
				max = n;
			}
		}

		System.out.println("Largest number: " + max);

	}

}
