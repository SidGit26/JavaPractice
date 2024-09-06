package FunctionsInJAVA;

import java.util.Arrays;
//varible length argument
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,45,6,68,67);
        multiple(2, 7, "Sidddharth");
    }
    static void fun(int ...v){  //array of int
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a, int b, String ...v){ //varible parameter argument should be the last
        System.out.println(Arrays.toString(v));
    }
}
