package CodeForces;

import java.util.*;

public class HarryPotter {
    static int Mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[][] points = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                points[i][j]=sc.nextInt();
            }
        }
        long[][] dp = new long[n][n];
        int[][] maxM = new int[n][n];
        dp[0][0] = 1;
        maxM[0][0] = points[0][0];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==0 && j==0) continue;
                dp[i][j] = 0;
                maxM[i][j] = 0;
                if (i>0 && (points[i-1][j]==2 || points[i-1][j]==3)) {
                    dp[i][j] = (dp[i][j]+dp[i-1][j]) % Mod;
                    if (maxM[i][j] < maxM[i-1][j]+points[i][j]) {
                        maxM[i][j] = maxM[i-1][j]+points[i][j];
                    }
                }
                if (j>0 && (points[i][j-1]==1 || points[i][j-1]==3)) {
                    dp[i][j] = (dp[i][j]+dp[i][j-1]) % Mod;
                    if (maxM[i][j]<maxM[i][j-1]+points[i][j]) {
                        maxM[i][j]=maxM[i][j-1]+points[i][j];
                    }
                }
            }
        }
        System.out.println(dp[n-1][n-1]+" "+maxM[n-1][n-1]);
    }
}