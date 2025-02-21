package Pattern_Printing;

import java.util.Scanner;

public class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            char ch='A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
