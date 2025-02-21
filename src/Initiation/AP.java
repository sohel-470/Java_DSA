package Initiation;

import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();
        System.out.print("Enter no. of terms to be printed: ");
        int n = sc.nextInt();
        int l = a + (n-1)*d;
        for(int i=a; i<=l; i+=d)
            System.out.print(i + " ");
    }
}
