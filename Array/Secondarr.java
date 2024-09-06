package Array;

import java.util.Arrays;  // Import the Arrays class for Arrays.toString()
import java.util.Scanner; // Import the Scanner class for reading input

public class Secondarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object to read input
        String[] str = new String[4];        // Initialize an array of 4 strings

        // Read input into the array
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter a string: "); // Prompt for input
            str[i] = in.next();                   // Read the next string from input
        }

        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(str)); 
        
        in.close(); // Close the Scanner to prevent resource leaks
    }
}
