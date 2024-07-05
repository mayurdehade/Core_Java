//Sorting an array in Java.
package com.jbk.practice01;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter element of array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered array: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//sorting of array
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\nSorted array: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
