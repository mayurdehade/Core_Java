package core.array;

public class JaggedArray {

    public static void main(String[] args) {
        // Create a jagged array (array of arrays with varying lengths)
        int[][] jaggedArray = new int[3][]; // Initialize the outer array with 3 rows

        // Initialize each row of the jagged array with different lengths
        jaggedArray[0] = new int[2]; // First row with 2 columns
        jaggedArray[1] = new int[3]; // Second row with 3 columns
        jaggedArray[2] = new int[1]; // Third row with 1 column

        // Populate the jagged array with values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;

        jaggedArray[2][0] = 6;

        // Print the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}

/* Output:
Jagged Array:
1 2 
3 4 5 
6 
*/
