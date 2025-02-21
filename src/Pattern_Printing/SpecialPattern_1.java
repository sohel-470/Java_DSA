package Pattern_Printing;

import java.util.Scanner;

public class SpecialPattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();

        // using formula
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }

        // without using formula
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*i; j+=2){    // since jump is increased by 2, so range is also increased twice
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        // without using any maths
        for(int i=1; i<=n; i++){
            int a=1;
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a+=2;
            }
            System.out.println();
        }
    }
}
