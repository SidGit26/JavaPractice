package Array;

import java.util.ArrayList; // Corrected import for ArrayList
import java.util.Scanner;   // Importing Scanner for input

public class Multial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Corrected ArrayList syntax for declaration and initialization
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization: Adding 3 empty ArrayLists (rows) to the main list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements to the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {  // Added 'int' before 'j'
                System.out.print("Enter element for row " + i + ", column " + j + ": ");
                list.get(i).add(in.nextInt()); // Getting the ArrayList at index 'i' and adding input
            }
        }

        // Printing the 2D ArrayList
        System.out.println("2D ArrayList: " + list);

        in.close(); // Closing the scanner to prevent resource leaks
    }
}
