package Initiation;

import java.util.Scanner;
public class Methods_CWH {
    static void square(int x)
    {
        for(int i=1; i<=x; i++)
            System.out.print(i*i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Squares to be printed:");
        int n = sc.nextInt();
        square(n);
    }
}
