package Recursion;

public class sum_1_to_n_return_type {
    public static int sum(int n){
        if(n==0 || n==1) return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println(sum(n));
    }
}
