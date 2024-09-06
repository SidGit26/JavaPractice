package FunctionsInJAVA;

public class Greeting { // Renamed the class from String to Greeting
    public static void main(String[] args) {
        String message = greet();  // No changes needed here
        System.out.println(message);  
    }

    static String greet() {
        String greeting = "How are you\n";
        return greeting;
    }
}
