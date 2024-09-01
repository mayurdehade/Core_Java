//Program to demonstrate MultiDimensional Array
//Multidimensional Array: Array of Arrays

//Multidimensional arrays are useful when you want to store data
//as a tabular form, like a table with rows and columns.

package core.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int myNumbers[][] = {{1,2,3,4},{5,6,7}};
		
		for(int i=0; i<myNumbers.length; i++) {
			for(int j=0; j<myNumbers[i].length; j++) {
				System.out.print(myNumbers[i][j]+" ");
			}
		}

	}

}
