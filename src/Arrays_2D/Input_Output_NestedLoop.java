package Arrays_2D;

import java.util.Scanner;
public class Input_Output_NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        int m = arr.length; //no of rows
        int n = arr[0].length; //no fo columns
        // Taking Input
        System.out.println("Enter elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing Output:-
        //1. By For-Loop
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        //2. By For-each Loop
        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
}
