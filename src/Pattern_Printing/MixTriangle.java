package Pattern_Printing;

import java.util.Scanner;

public class MixTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if(i%2==0) {
                char ch='A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
            } else {
                    for(int j=1; j<=i; j++){
                        System.out.print(j+" ");
                    }
            }
            System.out.println();
        }
    }
}
