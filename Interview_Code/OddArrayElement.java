//Java program to print the elements of an array present on add position.
package com.jbk.practice01;

public class OddArrayElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Odd elements of array: \n");
		for(int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i]+" ");
		}

	}

}
