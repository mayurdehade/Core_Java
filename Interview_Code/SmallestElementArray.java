//Java program to find smallest Element in Array
package com.jbk.practice01;

public class SmallestElementArray {

	public static void main(String[] args) {
		
		int arr[] = {5,8,4,0,3,7,6,-5,1};
		
		int min = Integer.MAX_VALUE;
		
		for(int n:arr) {
			if(min>n) {
				min = n;
			}
		}
		
		System.out.println("Smallest number: "+min);

	}

}
