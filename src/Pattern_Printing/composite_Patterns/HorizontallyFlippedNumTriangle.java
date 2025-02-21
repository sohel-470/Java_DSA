package Pattern_Printing.composite_Patterns;

import java.util.Scanner;

public class HorizontallyFlippedNumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print((char) (j+64) +" ");
            }
            System.out.println();
        }
    }
}
