public class NumCheck {
    public static void main(String[] args) {
        int n = 66066553;
        int count = 0;
        while(n>1){
            int rem = n%10;
            if (rem == 3) {
                count++;
            }

            n=n/10;

        }
        System.out.println(count);
    }
    
}
