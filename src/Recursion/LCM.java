package Recursion;

public class LCM {
    public static int gcd(int a, int b){
        for(int i=Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a=240, b=256;
        int lcm = a*b/gcd(a,b);
        System.out.println(lcm);
    }
}
