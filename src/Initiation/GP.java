package Initiation;

import java.math.BigInteger;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Term: ");
        int a = sc.nextInt();
        System.out.print("Enter Common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of terms to be printed: ");
        int n = sc.nextInt();

        // with formula
/*        int l = (int)(a*Math.pow(r,n-1));
        for(int i=a; i<=l; i*=r)
            System.out.print(i + " ");

 */
        //without formula
        for (int i = 1; i<=n; i++){
            a*=r;
            System.out.print(a + " ");
        }
    }
}
