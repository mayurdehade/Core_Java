//Java program to find sum of all elements of Array
package com.jbk.practice01;

public class SumOfAllElementsArray {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		int sum = 0;
		
		//using forEach loop
		for(int n:arr) {
			sum+=n;
		}
		
		System.out.println("Sum of all elements: "+ sum);
		
	}
}
