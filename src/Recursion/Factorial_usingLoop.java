package Recursion;

import java.math.BigInteger;

public class Factorial_usingLoop {
    public static void main(String[] args) {
        int n=10;
        int ans= 1;
        for(int i = 1; i<=n; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}
