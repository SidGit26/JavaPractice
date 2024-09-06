package FunctionsInJAVA;

import java.util.Arrays;

public class Multidimensional {
    public static void main(String[] args) {
        // 1D array: int[]
        // 2D array: int[][]
        // Example of a 2D array with different row lengths
        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10}
        };

        // Use Arrays.deepToString() to print the elements of the 2D array
        System.out.println(Arrays.deepToString(arr));
    }
}
