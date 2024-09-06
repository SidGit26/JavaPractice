package FunctionsInJAVA;
import java.util.Arrays;
public class ChangedValue {
    public static void main(String[] args) {
        //create a array
        int [] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]= 99; //if you make  a change to the object via this ref variable, same obect will be the change.
    }
}
