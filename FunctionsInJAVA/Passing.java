package FunctionsInJAVA;

import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
      int[] nums = { 3, 4 , 36, 27};
      System.out.println(Arrays.toString(nums)); 
      changed(nums);
      System.out.println(Arrays.toString(nums));
    }
    static void changed(int[] arr){
        arr [3] = 26;
    }
    
}
