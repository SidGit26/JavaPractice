import java.util.Scanner;

public class Typecasting {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        //Type should be compatible
        //float is greater than int
        //int num = input.nextInt(); not work
        //float num = input.nextFloat(); work

        //Integer to Float

        //typecasting eg
        int num = (int)(69.f); //output 69
        System.out.println(num);
    }
    
}
