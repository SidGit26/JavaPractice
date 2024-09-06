package FunctionsInJAVA;

public class Shadowing {

    //  static int x; // will be accesible allover this class
    static int x =  90;  //this will be shadowed
    public static void main(String[] args) {
        System.out.println(x);
        int x;  //intilaizing
        //System.out.println(x);  //between we cannot use it 
        x=46; //declaring
        //int x = 36;  // the class varible at line  6 is shadowed by this //lower level is overiidng upper level
        System.out.println(x);
       fun();
        
    }
     static void fun(){
       System.out.println(x);
     }
    }
    

