package FunctionsInJAVA.Questions;

//import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
       // Scanner in  = new Scanner(System.in);
        int x  = in.nextInt();
        boolean ans = isPrime(x);
        System.out.println(ans);
        
    }
    static boolean isPrime(int x){
      if (x <= 1){
        return false;
} 
    int c = 2;
    while(c * c <= x){
        if(x % c == 0){
            return false;
        }
        c++;
    }
       return c*c>x;
       
      }
    }

