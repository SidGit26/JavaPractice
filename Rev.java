public class Rev {
    public static void main(String[] args) {
        int num = 987650;
        int ans = 0;
        while( num > 0){
            int rem = num % 10;
            num /= 10;  // Removes the last digit from num



            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
    
}
