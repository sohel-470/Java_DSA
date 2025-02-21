package Initiation;

import java.util.Scanner;
public class APWithoutFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Common Difference: ");
        int d = sc.nextInt();
        System.out.print("Enter no. of terms to be printed: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            a+= d;
            System.out.print(a + " ");
        }
    }
}
