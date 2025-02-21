package Pattern_Printing;

import java.util.Scanner;
public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int m = sc.nextInt();
        System.out.print("Columns: ");
        int n = sc.nextInt();

        for(int i=1; i<=m; i++){           //no of rows
            for(int j=1; j<=n; j++){       //no of stars in that row
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
