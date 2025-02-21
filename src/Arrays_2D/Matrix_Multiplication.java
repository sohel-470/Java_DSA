package Arrays_2D;

import java.util.Scanner;

public class Matrix_Multiplication {
    static void print(int[][] axx){
        for(int[] ele : axx){
            for(int x : ele){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[][] M1 = {{1,2,1},{2,1,2}};
//        int m = M1.length, a = M1[0].length;
//        int[][] M2=  {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
//        int b = M2.length, n = M2[0].length;
        System.out.print("Enter Row of Matrix 1: ");
        int m = sc.nextInt();
        System.out.print("Enter column of Matrix 1: ");
        int a = sc.nextInt();
        System.out.print("Enter Row of Matrix 2: ");
        int b = sc.nextInt();
        System.out.print("Enter column of Matrix 2: ");
        int n = sc.nextInt();
        if(a==b){
            int[][] M1 = new int[m][a];
            System.out.println("Enter Matrix 1: ");
            for(int i=0; i<m; i++){
                for(int j=0; j<a; j++){
                    M1[i][j] = sc.nextInt();
                }
            }
            int[][] M2 = new int[b][n];
            System.out.println("Enter Matrix 2: ");
            for(int i=0; i<b; i++){
                for(int j=0; j<n; j++){
                    M2[i][j] = sc.nextInt();
                }
            }
            int[][] res = new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    // c[i][j] = M1[i][0]*M2[0][j] + M1[i][1]*M2[1][j] + M1[i][2]*M2[2][j] + so on...
                    for(int k=0; k<a; k++){
                        res[i][j] += M1[i][k]*M2[k][j];
                    }
                }
            }
            System.out.println("Resultant:");
            print(res);
        }
        else System.out.println("Multiplication not possible!");
    }
}
