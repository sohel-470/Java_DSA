package Pattern_Printing.composite_Patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("   ");
            }
            for (int j=1; j<=2*i-1; j++){
                    System.out.print("*  ");
            }
            System.out.println();
        }


        // using nsp & nst method(without using formula)

        int nsp= n-1;
        int nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=nst; j++){
                System.out.print("*  ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
