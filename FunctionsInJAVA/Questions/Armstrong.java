package FunctionsInJAVA.Questions;

//import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int x = in.nextInt();
        //boolean ans  = isArmtrong(x);
        //System.out.println(ans);

        for(int i = 100; i<1000; i++){
            if(isArmtrong(i)){
                System.out.println(i+ " ");
            }
        }
    }

    static boolean isArmtrong(int x){
        int orignal  = x;
        int sum = 0;
        while (x>0){
            int rem = x%10;
            x=x/10;
            sum = sum + rem*rem*rem;
        }
        return sum == orignal;

    }
    
}
