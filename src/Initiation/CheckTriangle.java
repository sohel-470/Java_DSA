package Initiation;

import java.util.Scanner;
public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Side:");
        int a = sc.nextInt();
        System.out.print("Enter Second Side:");
        int b = sc.nextInt();
        System.out.print("Enter Third Side:");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("Yes, it's a triangle");
        else
            System.out.println("Nope, not a triangle");
    }
}
