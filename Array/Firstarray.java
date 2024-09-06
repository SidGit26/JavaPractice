package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Firstarray {
    public static void main(String[] args) {
     Scanner  in  =  new Scanner(System.in);
    int [] arr = new int[5];
   // System.out.println(arr[3]);
    
    for (int i = 0; i < arr.length;i++){
         arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    // for(int i = 0 ; i< arr.length; i++){
    //     System.out.println(arr[i] + "  " );
    // }
    // //enhcanced forloop
    // for(int num : arr){
    //     System.out.println(num + " ");
    // }
    
        //    //store 5 rollno 
    //     int []  rollno = new int[ 5 ];
    //    //directly 
    //     int []  rollno1 = {21,22,34,56,75};
    //     int [ ] ros; // declartion of array ros is getting defined in the stack
    //      ros = new int[5]; // give size of the array alwasys   // intilization actually object is being create in the memomery (heap)

    }
    
}
