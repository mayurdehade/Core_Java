//Program to find the largest number in array
package core.array;

import java.util.Scanner;

public class LargestNumber {
	
	public static int largestNum(int arr[]) {
		int max = arr[0];
		for(int i: arr) {
			if(max<i) {
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter element of array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Maximum number is: "+largestNum(arr));
		sc.close();
	}

}
