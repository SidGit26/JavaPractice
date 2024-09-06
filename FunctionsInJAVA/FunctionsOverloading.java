package FunctionsInJAVA;

public class FunctionsOverloading {
    public static void main(String[] args) {
        fun("Siddharth");
        fun(2,6);
    }
    static void fun(int a , int b){
        System.out.println(a);
    }
    static void fun( String name){
        System.out.println(name);
    }
}
