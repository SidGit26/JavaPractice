package Array;
import java.util.Arrays;
public class Maxitem {
    public static void main(String[] args) {
        int [] arr ={ 12, 23, 45, 56,78,11};
        System.out.println("Array elements: " + Arrays.toString(arr));
        int max = findmax(arr);
        System.out.println("Maximum value in the array: " + max);

    }
    static int findmax(int[] arr){
        int maxVal=arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
            
        }
        
        return maxVal;

        
    }
    
}
