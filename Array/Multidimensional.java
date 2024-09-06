package Array;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] arr = {
            {1, 2, 3},   // Row 0
            {4, 5},      // Row 1
            {6, 7, 8, 9} // Row 2
        };

        // Printing the 2D array using Arrays.deepToString()
        System.out.println("Array elements: " + Arrays.deepToString(arr));

        // Iterating over the 2D array
        System.out.println("Iterating over array elements:");
        for (int i = 0; i < arr.length; i++) { // Loop through rows
            for (int j = 0; j < arr[i].length; j++) { // Loop through columns
                System.out.print(arr[i][j] + " "); // Print each element
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
