package FunctionsInJAVA;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Scope {
    public static void main(String[] args) {
    int a = 20;
    int b =  22;
    String name= "Sid";
    
    {
        //values intilazd in the block can reamin in block itself cannot use outside block
        int c = 20;
        name = "Sid";
        System.out.println(name);
        //values intilased in this block, will remian in block
System.out.println(c);
    }
    
    }
static void random(int marks){
    int num =65;
    System.out.println(marks); // i cannnot call a here due to scope constraint
    System.out.println(num);
    String namee = "Skid";
    System.out.println(namee);
}
    
    
}
