package Methods_Assignments;

public class Reverse_Number {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int dig = n%10;
            rev = rev*10 + dig;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 256;
        int r = reverse(n);
        System.out.println(r);
    }
}
