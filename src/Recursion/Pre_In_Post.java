package Recursion;

public class Pre_In_Post {
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n+" "); //pre-work
        pip(n-1);
        System.out.print(n+" "); //in-work
        pip(n-1);
        System.out.print(n+" "); //post-work
    }
    public static void main(String[] args) {
        int n=3;
        pip(n);
    }
}