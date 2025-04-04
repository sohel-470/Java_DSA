package Recursion;
//Find the no. of possible ways to reach nth stair if only 1 or 2 jumps are allowed at each step.
public class nth_Stair {
    public static int stair(long n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stair(n-1) + stair(n-2); //same as shifted Fibonacci
    }
    public static void main(String[] args) {
        long n=100;
        System.out.println(stair(n));
    }
}
