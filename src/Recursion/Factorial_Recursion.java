package Recursion;

public class Factorial_Recursion {
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
<<<<<<< HEAD
        int n=30;
=======
        int n=5;
>>>>>>> 4e66b85045394ae880b8a95ff405a6428b9044c9
        System.out.println(factorial(n));
    }
}
