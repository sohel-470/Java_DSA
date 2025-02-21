package Initiation;

public class swappingNumbers {
    public static void main(String[] args) {

        //without using 3rd variable
        int a=10;
        int b=20;
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println(a+" "+b);

        //using Bit-wise operator
        int p=50;
        int q=60;
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;
        System.out.println(p+" "+q);
    }
}
