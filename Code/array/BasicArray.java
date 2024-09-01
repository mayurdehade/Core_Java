//Basic program to demonstrate array
package core.array;

/*
 * Array are used to stores multiple values of similar data type with continues memory location.
 * Array index start form 0
 * Array is fix size
 */

public class BasicArray {
	public static void main(String[] args) {
		
		//creating array
		//int type of array with length 5
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+5; //storing the values to array
		}
		
		//display the array
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n-----------------");
		//display the elements using for each loop
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
