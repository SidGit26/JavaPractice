package Array;

import java.util.Arrays;

public class Reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);  // Reversing the entire array
        System.out.println(Arrays.toString(arr));  // Printing the reversed array
    }

    // Method to reverse the array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at the start and end indices
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Method to swap two elements in the array
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];  // Store the value at index1 in a temporary variable
        arr[index1] = arr[index2];  // Assign the value at index2 to index1
        arr[index2] = temp;  // Assign the stored value from temp to index2
    }
}
