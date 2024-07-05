//Find second largest number in an array.
package com.jbk.practice01;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {5,8,4,0,3,7,6,-5,1};
		
		int first = Integer.MIN_VALUE;
		
		int second = first;
		
		for(int i=0; i<arr.length; i++) {
			if(first < arr[i]) {
				first = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(first > arr[i] && arr[i] > second) {
				second = arr[i];
			}
		}
		
		System.out.println("Second Largest Number: "+second);
	}

}
